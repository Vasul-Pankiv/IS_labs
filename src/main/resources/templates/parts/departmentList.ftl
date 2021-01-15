

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Patients</th>
        <th scope="col">Staff</th>
        <th scope="col">Delete</th>

    </tr>
    </thead>
    <tbody>
    <#list hospital.departments as department>

        <tr>
            <th scope="row">${department?counter}</th>
            <td><a href="hospital?id=${department.id}">${department.name}</a></td>
            <td>
                <ul class="">
                    <#list department.patients as patient>
                        <li class=""><a href="staff?id${patient.id}">${patient.name} ${patient.surname}</a></li>
                    </#list>
                </ul>
            </td>
            <td>
                <ul class="">
                    <#list department.staff as st>
                        <li class=""><a href="staff?id${st.id}">${st.name} ${st.surname}</a></li>
                    </#list>
                </ul>
            </td>
            <td><a href="hospital/delete?id=${hospital.id}" class="btn btn-outline-danger">delete</a></td>
        </tr>
    </#list>
    </tbody>
</table>

