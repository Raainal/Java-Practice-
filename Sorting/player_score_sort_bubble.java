package Sorting;
class player_score_sort_bubble
{
    public static void main1()
    {
        String name[]={"a","b","c","d","e"};
        String country[]={"India","germany","WI","Australia","India"};
        int score[]={96,45,64,66,92};
        for(int i=0;i<=name.length;i++)
        {
            
            for(int j=0;j<name.length-1;j++)
            {
                if(score[j+1]<score[j])
                {
                    int s=score[j+1];
                    score[j+1]=score[j];
                    score[j]=s;

                    String q=country[j+1];
                    country[j+1]=country[j];
                    country[j]=q;

                    String p=name[j+1];
                    name[j+1]=name[j];
                    name[j]=p;
                }

            }

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
        for(int i=0;i<=name.length;i++)
        {
            
            for(int j=0;j<name.length-1;j++)
            {
                if(score[j+1]>score[j])
                {
                    int s=score[j+1];
                    score[j+1]=score[j];
                    score[j]=s;

                    String q=country[j+1];
                    country[j+1]=country[j];
                    country[j]=q;

                    String p=name[j+1];
                    name[j+1]=name[j];
                    name[j]=p;
                }

            }

        }
        for (int i=0;i<=score.length-1;i++)
        {
            System.out.println(name[i]+"  "+country[i]+"  "+score[i]);
        }
    }
}