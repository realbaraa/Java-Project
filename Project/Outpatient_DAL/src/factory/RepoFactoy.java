
package factory;

import repo.*;



public  class RepoFactoy {
    public static IRepo getRepo(RepoTypeEnum repoType)
    {
        switch(repoType){
            case sqlRepo:
                return new SqlRepo();
            case MemoryRepo : 
                return new StaticRepo();
            default :
                return null;
        }
        
    }
}
