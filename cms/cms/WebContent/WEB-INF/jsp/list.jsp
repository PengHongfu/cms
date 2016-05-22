<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的研修</title>
<link rel="stylesheet" type="text/css" href="theme/1/css/common.css">
<link rel="stylesheet" type="text/css" href="theme/1/css/front/style.css">
</head>

<body>
<div id="main">
   <div class="top">
    	<div class="topbg">
            <div class="logo_sign">
            	<div class="logo"></div>
                <div class="sign">
                	<span>欢迎您系统管理员</span>
                    <span class="sp_home">首页</span>
                    <span class="sp_backstage">
                      <a href="manager/toIndex.action">后台管理</a>
                      </span>
                    <span class="sp_signout">退出</span>
                </div>
            </div> 
            <div class="nav">
            	<ul class="navUI">
                	<li><a href="javascript:void(0);">首页</a></li>
                    <c:forEach items="${categorylist }" var="c">
	                    <li><a href="javascript:void(0);">${c.name }</a></li>
	                </c:forEach>
                </ul>
            </div>
            
        </div>
    </div>
    <div class="content">
    	<div class="congw">
           <div class="conlist">
                <div class="search_result">
                    	<div class="art_box">
                        	<div class="art_img"><a href="#"><img src="theme/1/images/front/doc.png"></a></div>
                            <div class="art_txt">
                            	<div class="title">2009-2010年人教版小学教科书<span class="icon_pen"></span></div>
                                <div class="tag_txt"><span>栏目名称：爱在身边</span><span class="pl30">学科：语文</span><span class="pl30">资源类型：教案</span></div>
                                <div class="tag_txt">
                                	<span>撰写人：赵帅</span><span class="pl30">上传时间：2013-02-10</span>
                                </div>
                            </div>
                            
                        </div>
                        <div class="art_box">
                        	<div class="art_img"><a href="#"><img src="theme/1/images/front/doc.png"></a></div>
                            <div class="art_txt">
                            	<div class="title">2009-2010年人教版小学教科书<span class="icon_pen"></span></div>
                                <div class="tag_txt"><span>栏目名称：爱在身边</span><span class="pl30">学科：语文</span><span class="pl30">资源类型：教案</span></div>
                                <div class="tag_txt">
                                	<span>撰写人：赵帅</span><span class="pl30">上传时间：2013-02-10</span>
                                </div>
                            </div>
                            
                        </div>
                        <div class="art_box">
                        	<div class="art_img"><a href="#"><img src="theme/1/images/front/doc.png"></a></div>
                            <div class="art_txt">
                            	<div class="title">2009-2010年人教版小学教科书<span class="icon_pen"></span></div>
                                <div class="tag_txt"><span>栏目名称：爱在身边</span><span class="pl30">学科：语文</span><span class="pl30">资源类型：教案</span></div>
                                <div class="tag_txt">
                                	<span>撰写人：赵帅</span><span class="pl30">上传时间：2013-02-10</span>
                                </div>
                            </div>
                            
                        </div>
                        <div class="art_box">
                        	<div class="art_img"><a href="#"><img src="theme/1/images/front/doc.png"></a></div>
                            <div class="art_txt">
                            	<div class="title">2009-2010年人教版小学教科书<span class="icon_pen"></span></div>
                                <div class="tag_txt"><span>栏目名称：爱在身边</span><span class="pl30">学科：语文</span><span class="pl30">资源类型：教案</span></div>
                                <div class="tag_txt">
                                	<span>撰写人：赵帅</span><span class="pl30">上传时间：2013-02-10</span>
                                </div>
                            </div>
                            
                        </div>
                        <div class="art_box">
                        	<div class="art_img"><a href="#"><img src="theme/1/images/front/doc.png"></a></div>
                            <div class="art_txt">
                            	<div class="title">2009-2010年人教版小学教科书<span class="icon_pen"></span></div>
                                <div class="tag_txt"><span>栏目名称：爱在身边</span><span class="pl30">学科：语文</span><span class="pl30">资源类型：教案</span></div>
                                <div class="tag_txt">
                                	<span>撰写人：赵帅</span><span class="pl30">上传时间：2013-02-10</span>
                                </div>
                            </div>
                            
                        </div>
                        <div class="page">分页</div>
                    </div>
                    
           </div>
            <div class="link">
            	<div class="linelink">
            		<span>友情链接：</span><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a><a href="javascript:void(0)">上海教育网</a>
                </div>
            </div>
        </div>
    </div>
    <div class="footer">
    	<div class="foot">
        	<p>杰普信息发布系统 技术支持：<a href="javascript:void(0)">上海杰普软件科技有限公司</a>      电话：021-xxxxxxx</p>
        </div>
    </div>
</div>
</body>
</html>