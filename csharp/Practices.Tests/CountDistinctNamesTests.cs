using Practices.LocalVariablesAndImmutable;

namespace Practices.Tests
{
    public class CountDistinctNamesTests
    {
        [Fact]
        public void Given_Empty_List_And_Empty_Dictionnary_When_CountNames_Then_Return_EmptyDic()
        {
            var list = new List<string>();
            var dic = new Dictionary<string, int>();

            var result = CountNamesHelper.CountNames(list, dic);

            Assert.Empty(result);
        }

        [Fact]
        public void Given_Empty_List_And_Dictionnary_When_CountNames_Then_Return_Dic()
        {
            var list = new List<string>();
            var dic = new Dictionary<string, int>() { { "Test", 2 }, { "Test2", 1 } };

            var result = CountNamesHelper.CountNames(list, dic);

            Assert.NotEmpty(result);
            Assert.Equal(2, result.Count);
            Assert.Equal(2, result["Test"]);
            Assert.Equal(1, result["Test2"]);
        }

        [Fact]
        public void Given_List_And_EmptyDictionnary_When_CountNames_Then_Return_CountNames()
        {
            var list = new List<string>() { "Test", "Test", "Test2" };
            var dic = new Dictionary<string, int>();

            var result = CountNamesHelper.CountNames(list, dic);

            Assert.NotEmpty(result);
            Assert.Equal(2, result.Count);
            Assert.Equal(2, result["Test"]);
            Assert.Equal(1, result["Test2"]);
        }

        [Fact]
        public void Given_List_And_Dictionnary_When_CountNames_Then_Return_Dic_With_Sum_CountNames()
        {
            var list = new List<string>() { "Test", "Test", "Test2", "Test3" };
            var dic = new Dictionary<string, int>() { { "Test", 2 }, { "Test2", 1 }, { "Test4", 5 } };

            var result = CountNamesHelper.CountNames(list, dic);

            Assert.NotEmpty(result);
            Assert.Equal(4, result.Count);
            Assert.Equal(4, result["Test"]);
            Assert.Equal(2, result["Test2"]);
            Assert.Equal(1, result["Test3"]);
            Assert.Equal(5, result["Test4"]);
        }
    }
}
