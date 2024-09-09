namespace Practices.LocalVariablesAndImmutable;

public class CountNamesHelper
{
    public static IDictionary<string, int> CountNames(IList<string> names, IDictionary<string, int> count)
    {
        foreach (string name in names)
        {
            if (!count.TryAdd(name, 1))
            {
                count[name]++;
            }
        }
        return count;
    }
}