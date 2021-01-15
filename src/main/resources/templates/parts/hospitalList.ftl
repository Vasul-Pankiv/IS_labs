<h3>Hospital list:</h3>
<a href="/hospital/add">Add new hospital</a>
<h3></h3>
<table class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">#</th>
        <th scope="col">Name</th>
        <th scope="col">Departments</th>
        <th scope="col">Delete</th>

    </tr>
    </thead>
    <tbody>
    <#list hospitals as hospital>

        <tr>
            <th scope="row">${hospital?counter}</th>
            <td><a href="hospital?id=${hospital.id}">${hospital.name}</a></td>
            <td>
                <ul class="">
                    <#list hospital.departments as department>
                        <li class=""><a href="department?id${department.id}">${department.name}</a></li>
                    </#list>
                </ul>
            </td>
            <td><a href="hospital/delete?id=${hospital.id}" class="btn btn-outline-danger">delete</a></td>
        </tr>
    </#list>
    </tbody>
</table>

