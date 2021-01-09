
    <div class="form-group  mt-3 col-5">
        <h2>Please fill form and press button to create new hospital:</h2>
        <form method="post" enctype="multipart/form-data">
            <div class="form-group row">
                <label class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <input name="name" type="text" class="form-control" placeholder="Hospital name">
                </div>
            </div>
            <div class="form-group">
                <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                <button class="btn btn-primary" type="submit">save</button>
            </div>
        </form>

    </div>
