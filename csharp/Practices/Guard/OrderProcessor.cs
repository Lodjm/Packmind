namespace Practices.Guard
{
    public class OrderProcessor
    {
        public void ProcessOrder(Order order)
        {
            //Throw ArgumentNullException if null
            //You can use a if clause with Throw new ArgumentNullException
            ArgumentNullException.ThrowIfNull(order);

            if (!order.IsValid())
            {
                //Handle invalid Order
                //And fast return
                return;
            }
            //Process Order
        }
    }
}
