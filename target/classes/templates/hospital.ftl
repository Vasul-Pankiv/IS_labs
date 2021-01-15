<#import "parts/common.ftl" as c>

<@c.page>
   <h3>Edit hospital:</h3>
   <form method="post" enctype="multipart/form-data">
      <div class="form-group row">
         <label class="col-sm-2 col-form-label">Name</label>
         <div class="col-sm-10">
            <input name="name" type="text" class="form-control" placeholder="Cinema name" value="${hospital.name}">
         </div>
      </div>
      <div class="form-group">
         <button class="btn btn-primary" type="submit">save</button>
      </div>
   </form>
   <#include "parts/departmentList.ftl">
</@c.page>