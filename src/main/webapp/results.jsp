<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head><title>Example :: Spring Application</title></head>
<body>
  <h1>Example - Spring Application</h1>
  <p>This is my test, and the sanitized text is <%=request.getAttribute("sanitized")%>.</p>
</body>
