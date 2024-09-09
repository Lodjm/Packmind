namespace Practices.LocalVariablesAndImmutable;

public class CountNamesHelper
{
    public static IReadOnlyDictionary <string, int> CountNames(IList<string> names, IDictionary<string, int> initialCount)
    {
        //Not optimized code for education purpose
        var countNames = names
            .GroupBy(n => n)
            .ToDictionary(group => group.Key, group => group.Count());

        foreach (var initial in initialCount)
        {
            if (countNames.ContainsKey(initial.Key))
            {
                countNames[initial.Key] += initial.Value;
            }
            else
            {
                countNames.Add(initial.Key, initial.Value);
            }
        }

        return countNames;
    }
}