/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.58
 * Generated at: 2022-07-02 14:43:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberCre_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:100,200,300,400,500,600,700,800,900\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core CSS -->\r\n");
      out.write("<script type=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("<link href=\"resources/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Additional CSS Files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/assets/css/fontawesome.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/assets/css/templatemo-eduwell-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/assets/css/owl.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/assets/css/lightbox.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<!-- member.css파일 -->	\r\n");
      out.write("<link rel = \"stylesheet\" type = \"text/css\" href = \"resources/css/member.css\">	\r\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	//빈 값이 있거나 조건에 맞지 않으면 회원가입이 안되도록 구현.\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('#addMember').click(function() {\r\n");
      out.write("			console.log('id=\"addMember\"인 회원가입버튼 click!');\r\n");
      out.write("			//아이디 중복 체크구현. \r\n");
      out.write("			//id가 #addMember인 회원가입 버튼을 눌렀을 때, ajax를 실행시켜 아이디 중복 체크를 하게 구현함.\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"memberIdCheck\",\r\n");
      out.write("				data : {\r\n");
      out.write("					\"user_id\" : $('#id').val()\r\n");
      out.write("				},\r\n");
      out.write("				//$('#id').val()는 input에 있는 id=\"id\"와 이름이 같아야한다.\r\n");
      out.write("				//\"user_id\"는 컨트롤러의 idcheck멥핑에 값이 들어가기때문에 idcheck부분이랑 이름 맞춰주어야한다.\r\n");
      out.write("				success : function(data) { //views아래에 있는 memberIdCheck.jsp의 실행결과가 data에 담김.\r\n");
      out.write("					if (data == 1) {\r\n");
      out.write("						//data=result(컨트롤러의 model의 result를 의미)\r\n");
      out.write("						//result==1이면 db에 있는 아이디라는 의미이기 때문에 사용할 수 없는 아이디이다. \r\n");
      out.write("						$('#idc').text('사용할 수 없는 아이디 입니다');\r\n");
      out.write("					}\r\n");
      out.write("				}//success\r\n");
      out.write("			})//ajax\r\n");
      out.write("			if ($('#id').val() == '') {//아이디입력안했을 시 text 띄우기				\r\n");
      out.write("				$('#idc').text('아이디를  입력해주세요');\r\n");
      out.write("				return false;\r\n");
      out.write("			} else if (($('#id').val().length) < 4) {//아이디길이 4자 이상				\r\n");
      out.write("				$('#idc').text('아이디를 4자 이상으로 입력해주세요');\r\n");
      out.write("				return false;\r\n");
      out.write("			} else {\r\n");
      out.write("				$('#idc').text('사용가능한 아이디 입니다');\r\n");
      out.write("			}\r\n");
      out.write("			if ($('#pw').val().length < 8) {\r\n");
      out.write("				$('#pwc1').text('비밀번호를 8자 이상으로 입력해주세요');\r\n");
      out.write("			} else if ($('#pw2').val() == '') {\r\n");
      out.write("				$('#pwc2').text('비밀번호 중복확인을 해주세요');\r\n");
      out.write("			} else if ($('#pw').val() != $('#pw2').val()) {\r\n");
      out.write("				$('#pwc2').text('비밀번호가 일치하지 않습니다.');\r\n");
      out.write("				//이름\r\n");
      out.write("			} else if ($('#name').val() == '') {\r\n");
      out.write("				$('#nac').text('이름을 입력하세요.');\r\n");
      out.write("				//핸드폰 번호\r\n");
      out.write("			} else if ($('#tel').val().length <= 10) {// 11보다 작으면 번호 다시 입력, 아래 input에 maxlength=\"11\"을 지정해주어 11글자가 최대가 되도록 구현			\r\n");
      out.write("				$('#tec').text('번호를  제대로 입력하세요.');\r\n");
      out.write("			} else if (isNaN($('#tel').val())) {//핸드폰번호는 숫자만 가능isNaN=not a number		\r\n");
      out.write("				$('#tec').text('번호를 다시 입력하세요.');\r\n");
      out.write("				//나이 조건 \r\n");
      out.write("			} else if (($('#age').val()) > 120) {//120보다 나이가 많으면 가입 불가\r\n");
      out.write("				$('#agec').text('나이를 다시 입력하세요.');\r\n");
      out.write("			} else if (($('#age').val()) < 5) {//5보다 나이가 적으면 가입 불가\r\n");
      out.write("				$('#agec').text('나이를 다시 입력하세요.');\r\n");
      out.write("			} else if (isNaN($('#age').val())) {//나이는 숫자만 가능isNaN		\r\n");
      out.write("				$('#agec').text('나이를 다시 입력하세요.');\r\n");
      out.write("				//주소\r\n");
      out.write("			} else if ($('#addr').val() == '') {\r\n");
      out.write("				$('#addrc').text('주소를 입력하세요.');\r\n");
      out.write("			} else {\r\n");
      out.write("				$('#form').submit();\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		})//#addMember	\r\n");
      out.write("\r\n");
      out.write("		//다시 한 번 누르면 text 내용을 없애주도록 구현.\r\n");
      out.write("		$('#id').click(function() {\r\n");
      out.write("			$('#idc').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#pw').click(function() {\r\n");
      out.write("			$('#pwc1').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#pw2').click(function() {\r\n");
      out.write("			$('#pwc1').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#pw2').click(function() {\r\n");
      out.write("			$('#pwc2').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#name').click(function() {\r\n");
      out.write("			$('#nac').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#tel').click(function() {\r\n");
      out.write("			$('#tec').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#age').click(function() {\r\n");
      out.write("			$('#agec').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$('#addr').click(function() {\r\n");
      out.write("			$('#addrc').text('')\r\n");
      out.write("		})\r\n");
      out.write("		$(\"#pw\").change(function() {\r\n");
      out.write("			checkPassword($('#pw').val());\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#id\").change(function() {\r\n");
      out.write("			checkId($('#id').val());\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#name\").change(function() {\r\n");
      out.write("			checkName($('#name').val());\r\n");
      out.write("		});\r\n");
      out.write("		$(\"#addr\").change(function() {\r\n");
      out.write("			checkAddr($('#addr').val());\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("	});//$(document)\r\n");
      out.write("\r\n");
      out.write("	//비밀번호 유효성 검사\r\n");
      out.write("	$(\"#pw\").change(function() {//change=> pw의 값이 변경되었을 때 실행.\r\n");
      out.write("		checkPassword($('#pw').val());\r\n");
      out.write("	});\r\n");
      out.write("	function checkPassword(pw) {\r\n");
      out.write("\r\n");
      out.write("		if (!/^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/.test(pw)) {\r\n");
      out.write("			alert('비밀번호는 8자 이상이어야 하며, 숫자/소문자/특수문자를 모두 포함해야 합니다.');\r\n");
      out.write("			//$('#pwc1').text('숫자+영문자+특수문자 조합으로 8자리 이상 사용해야 합니다.')\r\n");
      out.write("			$('#pw').val('').focus();\r\n");
      out.write("			//focus=>#pw가 선택되었을 때 실행되어, pw안에 들어있는 값을 지워준다.=> 유효성 검사를 통과한 pw만 쓰기 위한 과정\r\n");
      out.write("			//값을 지워주지 않았을 경우 회원가입하기 버튼을 누르면 회원가입이 완료되기 때문에 지워주어야 한다.\r\n");
      out.write("		}//if\r\n");
      out.write("	}//function checkPassword(pw)\r\n");
      out.write("	\r\n");
      out.write("	//아이디 유효성 검사\r\n");
      out.write("	$(\"#id\").change(function() {//change=> id의 값이 변경되었을 때 실행.\r\n");
      out.write("		checkId($('#id').val());\r\n");
      out.write("	});\r\n");
      out.write("	function checkId(id) {\r\n");
      out.write("\r\n");
      out.write("		if (!/^(?=.*[a-z])(?=.*[0-9]).{4,11}$/.test(id)) {\r\n");
      out.write("			alert('아이디는 4자~11자 이어야 하며, 숫자/영문소문자 모두 포함해야 합니다.');\r\n");
      out.write("			$('#id').val('').focus();\r\n");
      out.write("			//focus=>#id가 선택되었을 때 실행되어, pw안에 들어있는 값을 지워준다.=> 유효성 검사를 통과한 id만 쓰기 위한 과정\r\n");
      out.write("			//값을 지워주지 않았을 경우 회원가입하기 버튼을 누르면 회원가입이 완료되기 때문에 지워주어야 한다.\r\n");
      out.write("		}//if\r\n");
      out.write("	}//function checkId(id)\r\n");
      out.write("	\r\n");
      out.write("	//이름 유효성 검사\r\n");
      out.write("	$(\"#name\").change(function() {//change=> pw의 값이 변경되었을 때 실행.\r\n");
      out.write("		checkName($('#name').val());\r\n");
      out.write("	});\r\n");
      out.write("	function checkName(name) {\r\n");
      out.write("\r\n");
      out.write("		if ((!/^(?=.[가-힣a-zA-Z]).{1,11}$/.test(name))) {\r\n");
      out.write("			alert('이름은 숫자/특수문자를 제외하고 10자 이하로 입력해주세요.');\r\n");
      out.write("			$('#name').val('').focus();\r\n");
      out.write("		}//if\r\n");
      out.write("	}//\r\n");
      out.write("\r\n");
      out.write("	//주소 유효성 검사\r\n");
      out.write("	//한글+숫자만 가능.\r\n");
      out.write("	$(\"#addr\").change(function() {//change=> pw의 값이 변경되었을 때 실행.\r\n");
      out.write("		checkAddr($('#addr').val());\r\n");
      out.write("	});\r\n");
      out.write("	function checkAddr(addr) {\r\n");
      out.write("\r\n");
      out.write("		if ((!/^(?=.*[가-힣])(?=.*[0-9]).{4,30}$/.test(addr))) {\r\n");
      out.write("			alert('주소 형식에 맞게 입력해주세요.');\r\n");
      out.write("			$('#addr').val('').focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}//if\r\n");
      out.write("	}//\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	//취소버튼 눌렀을 때 productList.jsp호출\r\n");
      out.write("	$(document).ready(function() {\r\n");
      out.write("		$('#cancel').click(function() {\r\n");
      out.write("			alert(\"회원가입 취소 하시겠습니까?\");\r\n");
      out.write("			location.href = \"productList.jsp\";\r\n");
      out.write("		})\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"top\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("</div>\r\n");
      out.write("	<h3 class=\"active\">회원가입</h3>\r\n");
      out.write("	<form action=\"memberCreate1\" id=\"form\">\r\n");
      out.write("		<table>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">아이디</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"text\" name=\"user_id\" id=\"id\" placeholder=\"4자이상 입력해주세요\">\r\n");
      out.write("					<div id=\"idc\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">패스워드</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"password\" name=\"user_pw\" id=\"pw\"\r\n");
      out.write("					placeholder=\"숫자+영문자+특수문자합 8글자이상 써주세요\" value=\"wls2gml2!!\">\r\n");
      out.write("					<div id=\"pwc1\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">패스워드확인</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"password\" name=\"pw2\" id=\"pw2\" placeholder=\"비밀번호를 재입력해주세요\"\r\n");
      out.write("					value=\"wls2gml2!!\">\r\n");
      out.write("					<div id=\"pwc2\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">이름</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"text\" name=\"user_name\" id=\"name\" placeholder=\"성함을 입력해주세요\">\r\n");
      out.write("					<div id=\"nac\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">전화번호</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"text\" name=\"user_tel\" id=\"tel\" maxlength=\"11\"\r\n");
      out.write("					value=\"01012341234\" placeholder=\"하이폰을 제외한 핸드폰번호를 입력해주세요\"> <!-- 아래 input에 maxlength=\"11\"을 지정해주어 11글자가 최대가 되도록 구현 -->\r\n");
      out.write("					<div id=\"tec\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">나이</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"text\" name=\"user_age\" id=\"age\" placeholder=\"나이를 입력해주세요\">\r\n");
      out.write("					<div id=\"agec\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td class=\"left\">주소</td>\r\n");
      out.write("				<td class=\"right\"><input class=\"form-control input-lg\"\r\n");
      out.write("					type=\"text\" name=\"user_addr\" id=\"addr\" placeholder=\"주소를 입력해주세요\">\r\n");
      out.write("					<div id=\"addrc\"></div></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"2\">\r\n");
      out.write("				<div class=\"col-lg-12\">\r\n");
      out.write("					<button type=\"button\" id=\"addMember\" class=\"btn btn-light\">회원가입하기</button>\r\n");
      out.write("					<button type=\"button\" id=\"cancel\" class=\"btn btn-light\">회원가입취소</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				</td>\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("			</tr>\r\n");
      out.write("		</table>\r\n");
      out.write("	</form>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<div id=\"result\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
