const ROUTES_CONFIG = {
    default: '/',
    home: '/home',
    auth: '/auth'
} as const;

// type RouteConfig = "/" | "/home" | "/auth"
type RouteConfig = typeof ROUTES_CONFIG[keyof typeof ROUTES_CONFIG] 

const goToRoute = (route: RouteConfig) => {
    // Handle your route navigation
}

goToRoute(ROUTES_CONFIG.auth)