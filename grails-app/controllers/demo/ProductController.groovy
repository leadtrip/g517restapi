package demo


import grails.rest.*
import grails.converters.*

class ProductController extends RestfulController{
	static responseFormats = ['json', 'xml']

    ProductController() {
        super(Product)
    }

    ProductService productService

    def search(String q, Integer max ) {
        if (q) {
            respond productService.findByNameLike("%${q}%".toString(), [max: Math.min( max ?: 10, 100)])
        }
        else {
            respond([])
        }
    }
}
