
function navigateToSuccessPage() {
    console.log("Navigating to the success page...");
}

function navigateToFailurePage() {
    console.log("Navigating to the failure page...");
}

function handleEvent(event: string) {
    if (event === 'Done') {
        return navigateToSuccessPage();
    } 

    if (event === 'Failed') {
        return navigateToFailurePage();
    } 
    
    console.log('Unknown event');
}
