var Reflux = require('reflux'),
    AppConfig = require('../AppConfig'),
    DBService = require('../DBService');

module.exports = Reflux.createStore({
    token: '',
    init: function () {

    },
    isAuthorized: function(){
        return AppConfig.accessToken.access_token !== undefined;
    },

    login: function(username, password){
        var credentials = {
                username: username,
                password: password
            },
            setToken = function(token){
                AppConfig.accessToken = token;
                this.trigger(token);
            }.bind(this),
            statusCodeCallbacks = {
                    200: function(token){ // OK
                        setToken(token);
                    },
                    400: function(){ // Bad request
                        console.log('bad login params');
                    },
                    401: function(data){ // Unauthorised
                        console.log('Wrong username and/or password');
                    }
            };

        DBService.login(credentials, statusCodeCallbacks);
    }
});
