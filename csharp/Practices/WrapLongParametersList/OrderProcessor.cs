namespace Practices.WrapLongParametersList
{
    public record OrderConfig(string DefaultWarehouse, int MaxItems, int MinItems, string DefaultMail, DateTime LastUpdatedGeneralConditions);

    public class OrderProcessor
    {
        public void Processor(Order order, OrderConfig config)
        {
            //ProcessOrder
        }
    }
}
