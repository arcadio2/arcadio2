package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.*;

public final class VisualizarTraje_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>.:PAW-Consultar Productos</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"images/favicon.ico\">\n");
      out.write("<script src=\"bootstrap-ecommerce-uikit/ui-ecommerce/js/jquery-2.0.0.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"bootstrap-ecommerce-uikit/ui-ecommerce/js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"fonts/fontawesome/css/fontawesome-all.min.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/plugins/fancybox/fancybox.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"bootstrap-ecommerce-uikit/ui-ecommerce/plugins/fancybox/fancybox.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/plugins/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<script src=\"bootstrap-ecommerce-uikit/ui-ecommerce/plugins/owlcarousel/owl.carousel.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/plugins/owlcarousel/assets/owl.theme.default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/css/ui.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<link href=\"bootstrap-ecommerce-uikit/ui-ecommerce/css/responsive.css\" rel=\"stylesheet\" media=\"only screen and (max-width: 1200px)\"/>\n");
      out.write("<script src=\"bootstrap-ecommerce-uikit/ui-ecommerce/js/script.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function() {\n");
      out.write("}); \n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");

if(session.getAttribute("user")==null){
    System.out.println("hola");
    response.sendRedirect("index.html"); 
}


      out.write("\n");
      out.write("    <form name=\"frmTraje\" action=\"SFinalizarTraje\"  method=\"post\">\n");

             int idUs = (Integer) session.getAttribute("Id");
             int idCamisa = (Integer) session.getAttribute("MiCamisa");
             int idSaco = (Integer) session.getAttribute("MiSaco");
             int idPantalon = (Integer) session.getAttribute("MiPantalon");
             int idCorbata = (Integer) session.getAttribute("MiCorbata");
             int idZapato= (Integer) session.getAttribute("MiZapato");
             Camisa cam=new Camisa().buscarCamisa(idCamisa);
             Corbata cor=new Corbata().buscarCorbata(idCorbata);
             Pantalon pan=new Pantalon().buscarPantalon(idPantalon);
             Saco sac=new Saco().buscarSaco(idSaco);
             Zapato zap=new Zapato().buscarZapato(idZapato);
          
      out.write("\n");
      out.write("  \n");
      out.write("    <table>\n");
      out.write("        <input name=\"txtIdCamisa\" type=\"hidden\" id=\"txtIdCamisa\" size=\"1\" readonly value=\"");
      out.print(cam.getCamisa_id());
      out.write("\" >\n");
      out.write("        <input name=\"txtIdSaco\" type=\"hidden\" id=\"txtIdSaco\" size=\"1\" readonly value=\"");
      out.print(sac.getSaco_id());
      out.write("\" >\n");
      out.write("        <input name=\"txtIdPantalon\" type=\"hidden\" id=\"txtIdPantalon\" size=\"1\" readonly value=\"");
      out.print(pan.getPantalon_id());
      out.write("\" >\n");
      out.write("        <input name=\"txtIdCorbata\" type=\"hidden\" id=\"txtIdCorbata\" size=\"1\" readonly value=\"");
      out.print(cor.getCorbata_id());
      out.write("\" >\n");
      out.write("        <input name=\"txtIdZapato\" type=\"hidden\" id=\"txtIdZapato\" size=\"1\" readonly value=\"");
      out.print(zap.getZapato_id());
      out.write("\" >\n");
      out.write("        <input name=\"txtIdUs\" type=\"hidden\" id=\"txtIdUs\" size=\"1\" readonly value=\"");
      out.print(idUs);
      out.write("\" >\n");
      out.write("        \n");
      out.write("      \n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\t\n");
      out.write("  <div> <a href=\"");
      out.print(sac.getSaco_imagen());
      out.write("\" data-fancybox=\"\"><img src=\"");
      out.print(sac.getSaco_imagen());
      out.write("\"></a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"item-gallery\" ><a href=\"");
      out.print(cam.getCamisa_imagen());
      out.write("\" data-fancybox=\"\"> <img src=\"");
      out.print(cam.getCamisa_imagen());
      out.write("\"></a></div>\n");
      out.write("  <div class=\"item-gallery\" ><a href=\"");
      out.print(pan.getPantalon_imagen());
      out.write("\" data-fancybox=\"\"> <img src=\"");
      out.print(pan.getPantalon_imagen());
      out.write("\"></a></div>\n");
      out.write("  <div class=\"item-gallery\" ><a href=\"");
      out.print(cor.getCorbata_imagen());
      out.write("\" data-fancybox=\"\"> <img src=\"");
      out.print(cor.getCorbata_imagen());
      out.write("\"></a></div>\n");
      out.write("  <div class=\"item-gallery\" ><a href=\"");
      out.print(zap.getZapato_imagen());
      out.write("\" data-fancybox=\"\"> <img src=\"");
      out.print(zap.getZapato_imagen());
      out.write("\"></a></div>\n");
      out.write("\n");
      out.write("\t<h3 class=\"title mb-3\">Dale un nombre a tu traje:</h3>\n");
      out.write("\n");
      out.write("\t\t<input name=\"txtNomTra\" type=\"text\" id=\"txtNomTra\">\n");
      out.write("\t\n");
      out.write("  <dt>Descripción del traje:</dt>\n");
      out.write("  \n");
      out.write("      <p>Saco: ");
      out.print(sac.getSaco_descripcion());
      out.write(" </p>\n");
      out.write("      <p>Camisa: ");
      out.print(cam.getCamisa_descripcion());
      out.write("</p>\n");
      out.write("      <p>Pantalon: ");
      out.print(pan.getPantalon_descripcion());
      out.write("</p>\n");
      out.write("      <p>Corbata: ");
      out.print(cor.getCorbata_descripcion());
      out.write("</p>\n");
      out.write("      <p>Zapatos: ");
      out.print(zap.getZapato_descripcion());
      out.write("</p>\n");
      out.write("  \n");
      out.write("        <input class=\"btn  btn-primary\" type=\"submit\" name=\"button\" id=\"button\" value=\"Confirmar\">\n");
      out.write("\t\n");
      out.write("        <section class=\"section-content bg padding-y-sm\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<nav class=\"mb-3\">\n");
      out.write("<ol class=\"breadcrumb\">\n");
      out.write("    <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\n");
      out.write("    <li class=\"breadcrumb-item\"><a href=\"#\">Category name</a></li>\n");
      out.write("    <li class=\"breadcrumb-item\"><a href=\"#\">Sub category</a></li>\n");
      out.write("    <li class=\"breadcrumb-item active\" aria-current=\"page\">Items</li>\n");
      out.write("</ol> \n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-xl-10 col-md-9 col-sm-12\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<main class=\"card\">\n");
      out.write("\t<div class=\"row no-gutters\">\n");
      out.write("\t\t<aside class=\"col-sm-6 border-right\">\n");
      out.write("<article class=\"gallery-wrap\"> \n");
      out.write("<div class=\"img-big-wrap\">\n");
      out.write("  <div> <a href=\"images/items/1.jpg\" data-fancybox=\"\"><img src=\"images/items/1.jpg\"></a></div>\n");
      out.write("</div> <!-- slider-product.// -->\n");
      out.write("<div class=\"img-small-wrap\">\n");
      out.write("  <div class=\"item-gallery\"> <img src=\"images/items/1.jpg\"></div>\n");
      out.write("  <div class=\"item-gallery\"> <img src=\"images/items/2.jpg\"></div>\n");
      out.write("  <div class=\"item-gallery\"> <img src=\"images/items/3.jpg\"></div>\n");
      out.write("  <div class=\"item-gallery\"> <img src=\"images/items/4.jpg\"></div>\n");
      out.write("</div> <!-- slider-nav.// -->\n");
      out.write("</article> <!-- gallery-wrap .end// -->\n");
      out.write("\t\t</aside>\n");
      out.write("\t\t<aside class=\"col-sm-6\">\n");
      out.write("<article class=\"card-body\">\n");
      out.write("<!-- short-info-wrap -->\n");
      out.write("\t<h3 class=\"title mb-3\">Original Version of Some product name</h3>\n");
      out.write("\n");
      out.write("<div class=\"mb-3\"> \n");
      out.write("\t<var class=\"price h3 text-warning\"> \n");
      out.write("\t\t<span class=\"currency\">US $</span><span class=\"num\">1299</span>\n");
      out.write("\t</var> \n");
      out.write("\t<span>/per kg</span> \n");
      out.write("</div> <!-- price-detail-wrap .// -->\n");
      out.write("<dl>\n");
      out.write("  <dt>Description</dt>\n");
      out.write("  <dd><p>Here goes description consectetur adipisicing elit, sed do eiusmod\n");
      out.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("quis nostrud exercitation ullamco </p></dd>\n");
      out.write("</dl>\n");
      out.write("<dl class=\"row\">\n");
      out.write("  <dt class=\"col-sm-3\">Model#</dt>\n");
      out.write("  <dd class=\"col-sm-9\">12345611</dd>\n");
      out.write("\n");
      out.write("  <dt class=\"col-sm-3\">Color</dt>\n");
      out.write("  <dd class=\"col-sm-9\">Black and white </dd>\n");
      out.write("\n");
      out.write("  <dt class=\"col-sm-3\">Delivery</dt>\n");
      out.write("  <dd class=\"col-sm-9\">Russia, USA, and Europe </dd>\n");
      out.write("</dl>\n");
      out.write("<div class=\"rating-wrap\">\n");
      out.write("\n");
      out.write("\t<ul class=\"rating-stars\">\n");
      out.write("\t\t<li style=\"width:80%\" class=\"stars-active\"> \n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> \n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> \n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> \n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> \n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> \n");
      out.write("\t\t\t<i class=\"fa fa-star\"></i> \n");
      out.write("\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t<div class=\"label-rating\">132 reviews</div>\n");
      out.write("\t<div class=\"label-rating\">154 orders </div>\n");
      out.write("</div> <!-- rating-wrap.// -->\n");
      out.write("<hr>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t\t<div class=\"col-sm-5\">\n");
      out.write("\t\t\t<dl class=\"dlist-inline\">\n");
      out.write("\t\t\t  <dt>Quantity: </dt>\n");
      out.write("\t\t\t  <dd> \n");
      out.write("\t\t\t  \t<select class=\"form-control form-control-sm\" style=\"width:70px;\">\n");
      out.write("\t\t\t  \t\t<option> 1 </option>\n");
      out.write("\t\t\t  \t\t<option> 2 </option>\n");
      out.write("\t\t\t  \t\t<option> 3 </option>\n");
      out.write("\t\t\t  \t</select>\n");
      out.write("\t\t\t  </dd>\n");
      out.write("\t\t\t</dl>  <!-- item-property .// -->\n");
      out.write("\t\t</div> <!-- col.// -->\n");
      out.write("\t\t<div class=\"col-sm-7\">\n");
      out.write("\t\t\t<dl class=\"dlist-inline\">\n");
      out.write("\t\t\t\t  <dt>Size: </dt>\n");
      out.write("\t\t\t\t  <dd>\n");
      out.write("\t\t\t\t  \t<label class=\"form-check form-check-inline\">\n");
      out.write("\t\t\t\t\t  <input class=\"form-check-input\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\" type=\"radio\">\n");
      out.write("\t\t\t\t\t  <span class=\"form-check-label\">SM</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<label class=\"form-check form-check-inline\">\n");
      out.write("\t\t\t\t\t  <input class=\"form-check-input\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\" type=\"radio\">\n");
      out.write("\t\t\t\t\t  <span class=\"form-check-label\">MD</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t<label class=\"form-check form-check-inline\">\n");
      out.write("\t\t\t\t\t  <input class=\"form-check-input\" name=\"inlineRadioOptions\" id=\"inlineRadio2\" value=\"option2\" type=\"radio\">\n");
      out.write("\t\t\t\t\t  <span class=\"form-check-label\">XXL</span>\n");
      out.write("\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t  </dd>\n");
      out.write("\t\t\t</dl>  <!-- item-property .// -->\n");
      out.write("\t\t</div> <!-- col.// -->\n");
      out.write("\t</div> <!-- row.// -->\n");
      out.write("\t<hr>\n");
      out.write("\t<a href=\"#\" class=\"btn  btn-warning\"> <i class=\"fa fa-envelope\"></i> Contact Supplier </a>\n");
      out.write("\t<a href=\"#\" class=\"btn  btn-outline-warning\"> Start Order </a>\n");
      out.write("<!-- short-info-wrap .// -->\n");
      out.write("</article> <!-- card-body.// -->\n");
      out.write("\t\t</aside> <!-- col.// -->\n");
      out.write("\t</div> <!-- row.// -->\n");
      out.write("</main> <!-- card.// -->\n");
      out.write("\n");
      out.write("<!-- PRODUCT DETAIL -->\n");
      out.write("<article class=\"card mt-3\">\n");
      out.write("\t<div class=\"card-body\">\n");
      out.write("\t\t<h4>Detail overview</h4>\n");
      out.write("\t<p>\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\tproident, sunt in culpa qui officia ididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi deserunt mollit anim id est laborum.</p>\n");
      out.write("\t<p>\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\tcillum dolore eu fugiat nulla pariatur. Excepteurididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi sint occaecat cupidatat non\n");
      out.write("\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t<p>\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t<p>\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("\t\ttempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("\t\tquis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\n");
      out.write("\t\tconsequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\n");
      out.write("\t\tcillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non\n");
      out.write("\t\tproident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("\t</div> <!-- card-body.// -->\n");
      out.write("</article> <!-- card.// -->\n");
      out.write("\n");
      out.write("<!-- PRODUCT DETAIL .// -->\n");
      out.write("\n");
      out.write("</div> <!-- col // -->\n");
      out.write("<aside class=\"col-xl-2 col-md-3 col-sm-12\">\n");
      out.write("<div class=\"card\">\n");
      out.write("\t<div class=\"card-header\">\n");
      out.write("\t    Trade Assurance\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"card-body small\">\n");
      out.write("\t\t <span>China | Trading Company</span> \n");
      out.write("\t\t <hr>\n");
      out.write("\t\t Transaction Level: Good <br> \n");
      out.write("\t\t Supplier Assessments: Best \n");
      out.write("\t\t <hr>\n");
      out.write("\t\t 11 Transactions $330,000+\n");
      out.write("\t\t <hr>\n");
      out.write("\t\t Response Time 24h <br>\n");
      out.write("\t\t Response Rate: 94%  <br> \n");
      out.write("\t\t <hr>\n");
      out.write("\t\t <a href=\"\">Visit pofile</a>\n");
      out.write("\t\t \n");
      out.write("\t</div> <!-- card-body.// -->\n");
      out.write("</div> <!-- card.// -->\n");
      out.write("<div class=\"card mt-3\">\n");
      out.write("\t<div class=\"card-header\">\n");
      out.write("\t    You may like\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"card-body row\">\n");
      out.write("<div class=\"col-md-12 col-sm-3\">\n");
      out.write("\t<figure class=\"item border-bottom mb-3\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"img-wrap\"> <img src=\"images/items/2.jpg\" class=\"img-md\"></a>\n");
      out.write("\t\t\t<figcaption class=\"info-wrap\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"title\">The name of product</a>\n");
      out.write("\t\t\t\t<div class=\"price-wrap mb-3\">\n");
      out.write("\t\t\t\t\t<span class=\"price-new\">$280</span> <del class=\"price-old\">$280</del>\n");
      out.write("\t\t\t\t</div> <!-- price-wrap.// -->\n");
      out.write("\t\t\t</figcaption>\n");
      out.write("\t</figure> <!-- card-product // -->\n");
      out.write("</div> <!-- col.// -->\n");
      out.write("<div class=\"col-md-12 col-sm-3\">\n");
      out.write("<figure class=\"item border-bottom mb-3\">\n");
      out.write("\t\t<a class=\"img-wrap\"> <img src=\"images/items/3.jpg\" class=\"img-md\"></a>\n");
      out.write("\t\t<figcaption class=\"info-wrap\">\n");
      out.write("\t\t\t<a href=\"#\" href=\"#\" class=\"title\">The name of product</a>\n");
      out.write("\t\t\t<div class=\"price-wrap mb-3\">\n");
      out.write("\t\t\t\t<span class=\"price-new\">$280</span>\n");
      out.write("\t\t\t</div> <!-- price-wrap.// -->\n");
      out.write("\t\t</figcaption>\n");
      out.write("</figure> <!-- card-product // -->\n");
      out.write("</div> <!-- col.// -->\n");
      out.write("<div class=\"col-md-12 col-sm-3\">\n");
      out.write("<figure class=\"item border-bottom mb-3\">\n");
      out.write("\t\t<a href=\"#\" class=\"img-wrap\"> <img src=\"images/items/4.jpg\" class=\"img-md\"></a>\n");
      out.write("\t\t<figcaption class=\"info-wrap\">\n");
      out.write("\t\t\t<a href=\"#\" class=\"title\">The name of product</a>\n");
      out.write("\t\t\t<div class=\"price-wrap mb-3\">\n");
      out.write("\t\t\t\t<span class=\"price-new\">$280</span>\n");
      out.write("\t\t\t</div> <!-- price-wrap.// -->\n");
      out.write("\t\t</figcaption>\n");
      out.write("</figure> <!-- card-product // -->\n");
      out.write("</div> <!-- col.// -->\n");
      out.write("\t</div> <!-- card-body.// -->\n");
      out.write("</div> <!-- card.// -->\n");
      out.write("</aside> <!-- col // -->\n");
      out.write("</div> <!-- row.// -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div><!-- container // -->\n");
      out.write("</section>\n");
      out.write("\t\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
