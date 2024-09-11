using Microsoft.Extensions.Logging;

namespace Practices.PureFunctions
{
    public static class MathHelper
    {
        public static int Sum(int x, int y)
        {
            // Without external references, sum is now a pure method
            return x + y;
        }
    }

    public class Example
    {
        private readonly ILogger<Example> _logger;

        public Example(ILogger<Example> logger)
        {
            _logger = logger;
        }

        public void Process()
        {
            int x = 1;
            int y = 1;

            //Logger can have a side effect
            _logger.Log(LogLevel.Information, $"Sum {x} + {y}");
            var r = MathHelper.Sum(x, y);
        }
    }
}
