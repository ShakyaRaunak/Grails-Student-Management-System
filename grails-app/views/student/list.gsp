<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/> 
        <meta name="layout" content="main" /> 
        <title>Student</title> 
    </head> 
    <body> 
        <div class="body"> 
            <g:if test="${flash.message}"> 
                <div class="message">${flash.message}</div> 
            </g:if> 
            <g:each in="${studentInstanceList}" 
                status="i" var="studentInstance"> 
                <div class="student"> 
                    <h2>${studentInstance.firstName}</h2> 
                    <p class="student-details"> 
                        <span class="question">Admitted On?</span> 
                        <span class="answer"> 
                            ${studentInstance.dateOfAdmission.format("EEEE, MMMM d, yyyy")}</span> 
                    </p> 
                    <p class="student-details"> 
                        <span class="question">Residence?</span> 
                        <span class="answer"> 
                            ${studentInstance.city}, ${studentInstance.state}</span> 
                    </p> 
                    <p class="student-details"> 
                        <span class="question">How old?</span> 
                        <span class="answer"> 
                            <g:formatNumber 
                            number="${studentInstance.age}" 
                                format="0 Years old" /></span> 
                    </p> 
                    <p class="student-details"> 
                        <span class="question">Telephone?</span> 
                        <span class="answer"> 
                            ${studentInstance.telephone}</span> 
                                </p> 
                                </div> 
                                </g:each> 
                                <div class="paginateButtons"> 
                                <g:paginate total="${studentInstanceTotal}" /> 
                </div> 
            </div> 
        </body> 
    </html> 
