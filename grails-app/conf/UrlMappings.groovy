class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "/index.gsp"(view:"/index") // <-- added this line for Grails 2.0.0 / WL 10.3.4
	}
}
