<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>系统主页</title>
    <meta name="viewport" charset="utf-8" content="width=device-width, initial-scale=1">
    <%@ include file="/tabledata.jsp" %>
    <link href="${pageContext.request.contextPath}/css/bootstrap-override.css" rel="stylesheet">
    <style>
        .form-control {
            border-radius: 5px;
            height: 30px;
        }
    </style>

</head>
<body>
<div id="abc" class="panel panel-dark-head">
    <div class="panel-heading">
        <h4 class="panel-title">编辑组织信息</h4>
    </div>
    <!-- panel-heading -->
    <div class="panel-body nopadding">
        <form id="roleForm" method="post" class="form-bordered">
            <input id="dutyId" name="dutyid" type="hidden" value="<%=request.getParameter("id")%>">
            <div class="form-group">
                <label class="col-sm-4 control-label">岗位名称</label>
                <div class="col-sm-8">
                    <input class="form-control" id="name" name="name" placeholder="请输入岗位名称">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label">组织信息</label>
                <div class="col-sm-8">
                    <div class="input-group mb15">
                        <input id="organ_name" class="form-control" type="text" name="organization.organ_name"
                               placeholder="请输入组织信息"/>
                        <input id="organ_uuid" type="hidden" name="organization.organ_uuid"/>
                        <span class="input-group-addon" data-toggle="modal" data-target="#orgTree"><i
                                class="fa fa-paper-plane"></i></span>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-4 control-label">角色信息</label>
                <div class="col-sm-8">
                    <div class="input-group mb15">
                        <input id="role_uuid" type="hidden" name="role.role_uuid"/>
                        <input class="form-control" id="role_name" name="role.role_name" placeholder="请输入角色名称">
                        <span class="input-group-addon" data-toggle="dropdown" aria-haspopup="true"
                              aria-expanded="false"><i class="fa fa-align-justify"></i></span>
                        <ul id="selectRole" class="dropdown-menu dropdown-menu-right">
                        </ul>
                    </div>
                </div>
            </div>
            <div class="form-group" style="text-align: center;">
                <div class="col-sm-12" style="text-align: center;">
                    <input type="button" class="btn btn-default" onclick="submitForm()" value="提交"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="reset" class="btn btn-default">重置</button>
                </div>
            </div>
        </form>
    </div>
</div>
<!-- 组织树 -->
<div id="orgTree" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">组织树</h4>
            </div>
            <div class="modal-body">
                <%@ include file="/orgTree.jsp" %>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" onclick="getResult()">确定</button>
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
<script type="text/javascript">
    $(function () {
        toastr.options = {
            positionClass: "toast-center-center",
            timeOut: "10000",
            showMethod: "fadeIn",
            hideMethod: "fadeOut",
            onclick: function () {
                window.location.href = '${pageContext.request.contextPath}/duty/duties.jsp';
            }
        };

        //初始化页面
        $.get('${pageContext.request.contextPath}/duty/findOne.do', {id: $('#dutyId').val()}, function (duty) {
            $('#name').val(duty.name);
            //$('#parent_uuid').val(duty.organ.organ_uuid);
            //$('#parent_name').val(duty.organ.organ_name);
            $('#organ_uuid').val(duty.organization.organ_uuid);
            $('#role_name').val(duty.role.role_name);
            $('#role_uuid').val(duty.role.role_uuid);
            $('#organ_name').val(duty.organization.organ_name);
            $('#dutyid').val(duty.dutyid);
        }, "json");

        $.get('${pageContext.request.contextPath}/duty/findAllRole.do', {}, function (data) {
            var html = '';
            for (var i = 0; i < data.length; i++) {
                var id = "'" + data[i].role_uuid + "'";
                var name = "'" + data[i].role_name + "'";
                html += '<li><a href="#" id="' + data[i].role_uuid + '" onclick="chooseRole(' + id + ' ,' + name + ' )">' + data[i].role_name + '</a></li>';
            }
            $('#selectRole').append(html);
        }, "json");
    });

    function chooseRole(id, name) {
        $('#role_uuid').val(id);
        $('#role_name').val(name);
    }


    function submitForm() {
        var form = $('#roleForm').serialize();
        $.post('${pageContext.request.contextPath}/duty/update.do', form, function (data) {
            if (data.success) {
                toastr.success('<strong>成功&nbsp;! </strong>&nbsp;&nbsp;请到数据列表进行查看。');
            } else {
                toastr.error('<strong>失败&nbsp;! </strong>&nbsp;&nbsp;请检查数据正确性或联系管理员。');
            }
            setTimeout(function () {
                window.location.href = '${pageContext.request.contextPath}/duty/duties.jsp';
            }, 11000);
        }, "json");
    }

    function getResult() {
        var result = $('#result').val().split(',');
        $('#organ_name').val(result[0]);
        $('#organ_uuid').val(result[1]);
        $("#orgTree").modal('hide'); //手动关闭
    }

    setBodyHeight();
    window.parent.setMainDivHeight($('#abc').css('height'));
</script>
</body>
</html>