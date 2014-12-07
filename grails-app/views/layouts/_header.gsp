<g:if test="${session.user}">
    <g:render template="/layouts/studentSearch"/>
</g:if>
<div id="header">
    <p><a class="header-main" href="${resource(dir: '')}">Siddhartha Vanasthali Institute</a></p>

    <p class="header-sub">Student Management System</p>

    <div id="loginHeader">
        <g:loginControl/>
    </div>
</div> 