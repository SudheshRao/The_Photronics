var cartApp = angular.module ("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http){

	 $scope.addToCart = function (id) {
     	$http.put('http://localhost:8080/the_photronics/res/cart/add/'+id).success(function () {
     		waitingDialog.show('Custom message', {dialogSize: 'sm', progressType: 'warning'});
     		

     });
 };
 
 
 $scope.refreshCart = function () {
     $http.get('http://localhost:8080/the_photronics/res/cart/'+$scope.cartId).success(function (data) {
        $scope.cart=data;
        console.log($scope.cart);
        
        
     });
 };

 $scope.clearCart = function (cartid) {
     alert("Product successfully added to the cart!"+cartid)

     $http.put('http://localhost:8080/the_photronics/res/cart/clear/'+cartid).success(function (data) {         alert("Product successfully added to the cart!")

     	$scope.refreshCart();
     });
 };

 $scope.initCartId = function (cartId) {
 	console.log("hi");
     $scope.cartId = cartId;
    console.log($scope.cartId);
     $scope.refreshCart(cartId);
 };
 
 $scope.removeFromCart = function (ciid) {
     $http.put('http://localhost:8080/the_photronics/res/cart/remove/'+ciid).success(function (data) {
    	 alert("Product successfully removed from the cart!")

         $scope.refreshCart();
     });
 };

 $scope.calGrandTotal = function () {
     var grandTotal=0;

     for (var i=0; i<$scope.cart.cartItems.length; i++) {
         grandTotal+=$scope.cart.cartItems[i].totalPrice;
     }

     return grandTotal;
 };
});
