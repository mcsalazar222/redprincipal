import java.io.BufferedWriter;
{
    	boolean Result = true;
    	
    	FileWriter file;
        BufferedWriter writer;
    	
    	try 
        {
            file = new FileWriter(FilePath, !CleanFileContent);
            writer = new BufferedWriter(file);
            writer.write(FileContent,
                    0,
                    FileContent.length());
                    
            writer.close();
            file.close();
        } 
        catch (IOException ex) 
        {
        	Result = false;
            ex.printStackTrace();
        }
        finally
        {
        	return Result;
        }
 }