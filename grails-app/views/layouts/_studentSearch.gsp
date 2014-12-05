<div id="search"> 
    <g:form url='[controller: "student", action: "search"]' 
        id="studentSearchForm" 
        name="studentSearchForm" 
        method="get"> 
        <g:textField name="q" value="${params.q}" /> 
        <input type="submit" value="Find a student" /> 
    </g:form> 
</div> 
