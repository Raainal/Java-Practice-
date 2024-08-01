package Sorting;
class player_score_sort_selection
{
    public static void main1()
    {
        String name[]={"a","b","c","d","e"};
        String country[]={"India","germany","WI","Australia","India"};
        int score[]={96,45,64,66,92};
        for(int i=0;i<=name.length-1;i++)
        {
            int index=i;
            for(int j=i+1;j<name.length;j++)
            {
                if(score[index]<score[j])
                {
                    index=j;
                }

            }
            int s=score[index];
            score[index]=score[i];
            score[i]=s;

            String q=country[index];
            country[index]=country[i];
            country[i]=q;

            String p=name[index];
            name[index]=name[i];
                name[i]=p;
        }
        for (int i=0;i<=score.length-1;i++)
        {
            System.out.println(name[i]+"  "+country[i]+"  "+score[i]);
        }
    }
    public static void main2()
    {
        String name[]={"a","b","c","d","e"};
        String country[]={"India","germany","WI","Australia","India"};
        int score[]={96,45,64,66,92};
        for(int i=0;i<=name.length-1;i++)
        {
            int index=i;
            for(int j=i+1;j<name.length;j++)
            {
                if(score[index]>score[j])
                {
                    index=j;
                }

            }
            int s=score[index];
            score[index]=score[i];
            score[i]=s;

            String q=country[index];
            country[index]=country[i];
            country[i]=q;

            String p=name[index];
            name[index]=name[i];
                name[i]=p;
        }
        for (int i=0;i<=score.length-1;i++)
        {
            System.out.println(name[i]+"  "+country[i]+"  "+score[i]);
        }
    }
}