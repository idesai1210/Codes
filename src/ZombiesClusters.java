/*
 * Complete the function below.
 */
    static int [][] zArray =null;
    static int len;
static HashMap<Integer,Boolean> visited=new HashMap<Integer,Boolean>();
    static void dfs(int u){
        for(int j=0;j<len;j++){
            if(zArray[u][j]>0 && j!=u && (Boolean)visited.get(j)==false){
                visited.put(j,true);
                dfs(j);
            }
        }
    }
    
    static int zombieCluster(String[] zombies) {
        zArray= new int[zombies.length][zombies.length];
        len = zombies.length;
        for(int i = 0;i < len;i++) {
            for(int j = 0; j < len;j++){
                char arr[] = zombies[i].toCharArray();
                zArray[i][j] = arr[j] - '0';
            }
            visited.put(i,false);
        }
        int result=0;
        for(int u=0;u<len;u++){
            if((Boolean)visited.get(u)==false){
                visited.put(u,true);
                result++;
                dfs(u);
            }
        }
        return result;
    }

