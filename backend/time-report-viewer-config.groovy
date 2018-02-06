dropbox.time_report.folder.url = ''


grails.plugin.springsecurity.providerNames = ['ldapAuthProvider'] // specify this when you want to skip attempting to load from db and only use LDAP
grails.plugin.springsecurity.password.algorithm = 'SHA' // found SHA from confluence
grails.plugin.springsecurity.ldap.context.server = ''

grails.plugin.springsecurity.ldap.context.managerDn = 'cn=admin,dc=find-out,dc=se' // verified
grails.plugin.springsecurity.ldap.context.managerPassword = '' // verified


grails.plugin.springsecurity.ldap.search.filter="uid={0}"
grails.plugin.springsecurity.ldap.search.searchSubtree = true
grails.plugin.springsecurity.ldap.auth.hideUserNotFoundExceptions = false
grails.plugin.springsecurity.ldap.mapper.userDetailsClass = 'inetorgperson'

grails.plugin.springsecurity.ldap.authorities.groupSearchBase = 'ou=groups,dc=find-out,dc=se'
grails.plugin.springsecurity.ldap.search.base = 'ou=People,dc=find-out,dc=se'
