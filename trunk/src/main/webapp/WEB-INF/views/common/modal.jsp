<%--
 All modal will used on every page

 @author <a href="mailto:muziriyun@gmail.com">mzry1992</a>
 @version 1
--%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%--
<s:if test="currentUser == null">
    <!-- Login Modal -->
    <div id="loginModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="loginModal" aria-hidden="true">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="loginModalLabel">Login</h3>
        </div>
        <div class="modal-body">
            <form class="form-horizontal">
                <fieldset>
                    <s:textfield name="userName"
                                 maxLength="24"
                                 cssClass="span4"
                                 label="User Name"
                                 theme="bootstrap"/>
                    <s:password name="password"
                                maxLength="20"
                                cssClass="span4"
                                label="Password"
                                theme="bootstrap"/>
                </fieldset>
            </form>
        </div>
        <div class="modal-footer">
            <a href="#" class="btn btn-primary">Login</a>
            <a href="#" class="btn" data-dismiss="modal" aria-hidden="true">Close</a>
        </div>
    </div>

    <!-- Register Modal -->
    <div id="registerModal" class="modal hide fade modal-large" tabindex="-1" role="dialog" aria-labelledby="registerModal" aria-hidden="true">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="registerModalLabel">Register</h3>
        </div>
        <div class="modal-body">
            <form class="form-horizontal">
                <fieldset>
                    <s:textfield name="userDTO.userName"
                                 maxLength="24"
                                 cssClass="span4"
                                 label="User Name"
                                 theme="bootstrap"/>
                    <s:password name="userDTO.password"
                                maxLength="20"
                                cssClass="span4"
                                label="Password"
                                theme="bootstrap"/>
                    <s:password name="userDTO.passwordRepeat"
                                maxLength="20"
                                cssClass="span4"
                                label="Repeat your password"
                                theme="bootstrap"/>
                    <s:textfield name="userDTO.nickName"
                                 maxLength="20"
                                 cssClass="span4"
                                 label="Nick name"
                                 theme="bootstrap"/>
                    <s:textfield name="userDTO.email"
                                 maxLength="100"
                                 cssClass="span4"
                                 label="Email"
                                 theme="bootstrap"/>
                    <div class="control-group ">
                        <label class="control-label"></label>
                        <div class="controls">
                                Your email will be used for <a href="http://en.gravatar.com/">Gravatar</a> server and get back your password.
                        </div>
                    </div>
                    <s:textfield name="userDTO.school"
                                 maxLength="50"
                                 cssClass="span4"
                                 value="UESTC"
                                 label="School"
                                 theme="bootstrap"/>
                    <s:select name="userDTO.departmentId"
                              list="global.departmentList"
                              listKey="departmentId"
                              listValue="name"
                              cssClass="span4"
                              label="Department"
                              theme="bootstrap"/>
                    <s:textfield name="userDTO.studentId"
                                 maxLength="20"
                                 cssClass="span4"
                                 label="Student ID"
                                 theme="bootstrap"/>
                </fieldset>
            </form>
        </div>

        <div class="modal-footer">
            <a href="#" class="btn btn-primary">Register</a>
            <a href="#" class="btn" data-dismiss="modal" aria-hidden="true">Close</a>
        </div>
    </div>

    <!-- User activate Modal -->
    <div id="activateModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="activateModal" aria-hidden="true">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            <h3 id="activateModalLabel">Forget password</h3>
        </div>
        <div class="modal-body">
            <form class="form-horizontal">
                <fieldset>
                    <s:textfield name="userName"
                                 maxLength="24"
                                 cssClass="span4"
                                 label="User Name"
                                 theme="bootstrap"/>
                </fieldset>
            </form>
        </div>
        <div class="modal-footer">
            <a href="#" class="btn btn-primary">Send Email</a>
            <a href="#" class="btn" data-dismiss="modal" aria-hidden="true">Close</a>
        </div>
    </div>
</s:if>
--%>
</body>
</html>