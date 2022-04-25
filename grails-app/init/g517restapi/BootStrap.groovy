package g517restapi

import demo.Product

class BootStrap {

    def init = { servletContext ->
        new Product(name: 'cow', price: 400.00).save()
        new Product(name: 'paint', price: 22.99).save()
        new Product(name: 'fridge', price: 299.00).save()
        new Product(name: 'door', price: 99.51).save()
        new Product(name: 'mower', price: 317.20).save()
    }

    def destroy = {
    }
}
