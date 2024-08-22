namespace Practices.CollectionsNotNull
{
    public class OrderProcessor
    {
        private List<Order> _orders = new();

        public void AddOrders(List<Order> orders)
        {
            if (orders == null)
                return;

            _orders.AddRange(orders);
        }
    }
}
