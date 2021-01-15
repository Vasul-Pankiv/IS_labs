<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
    <#assign
    currentUser = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    name = currentUser.getUsername()
    currentUserId = currentUser.getId()
    >
<#else>
    <#assign
    name = "unknown"
    currentUserId = -1
    >
</#if>