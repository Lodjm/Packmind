using Microsoft.Extensions.Logging;

namespace Practices.PureFunctions
{
    public static class MathHelper
    {
        public static int Sum(int x, int y, ILogger logger)
        {
            logger.Log(LogLevel.Information, $"Sum {x} + {y}");
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
            var r = MathHelper.Sum(1, 1, _logger);
        }
    }
}
