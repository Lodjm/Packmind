namespace Practices.Guard
{
    public class OrderProcessor
    {
        public void ProcessOrder(Order order)
        {
            if (order != null)
            {
                if (order.IsValid())
                {
                    // process order
                }
                else
                {
                    // handle invalid order
                }
            }
            else
            {
                // handle null order
            }
        }
    }
}
