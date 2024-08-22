namespace Practices.CollectionsNotNull
{
    public class OrderProcessor
    {
        private List<Order> _orders = new();

        public void AddOrders(OrderCollection orders)
        {
            _orders.AddRange(orders);
        }
    }
}
