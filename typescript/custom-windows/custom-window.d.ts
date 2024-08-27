declare global {
    interface Window {
        getMyCustomProperties: () => string
    }
}