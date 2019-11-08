class GameModel
{
  boolean[][] circles;
  boolean[][] crosses;
  
  public GameModel()
  {
    circles = new boolean[3][3];
    crosses = new boolean[3][3];
    
    for (int i = 0; i < 3; i += 1)
    {
      for (int j = 0; j < 3; j += 1)
      {
        circles[i][j] = false;
        crosses[i][j] = false;
      }
    }
    
  }
  public boolean SetCircle(int x, int y)
  {
      this.circles[x][y] = true;

      if (this.circles[0][0] && this.circles[0][1] && this.circles[0][2])
      {
          return true;
      }

      if (this.circles[1][0] && this.circles[1][1] && this.circles[1][2])
      {
          return true;
      }

      if (this.circles[2][0] && this.circles[2][1] && this.circles[2][2])
      {
          return true;
      }

      if (this.circles[0][0] && this.circles[1][0] && this.circles[2][0])
      {
          return true;
      }

      if (this.circles[0][1] && this.circles[1][1] && this.circles[2][1])
      {
          return true;
      }

      if (this.circles[0][2] && this.circles[0][2] && this.circles[2][2])
      {
          return true;
      }

      if (this.circles[0][0] && this.circles[1][1] && this.circles[2][2])
      {
          return true;
      }
      
      if (this.circles[2][0] && this.circles[1][1] && this.circles[0][2])
      {
          return true;
      }

      return false;
  }

  public boolean SetCircle(int x, int y)
  {
      this.circles[x][y] = true;

      if (this.circles[0][0] && this.circles[0][1] && this.circles[0][2])
      {
          return true;
      }

      if (this.circles[1][0] && this.circles[1][1] && this.circles[1][2])
      {
          return true;
      }

      if (this.circles[2][0] && this.circles[2][1] && this.circles[2][2])
      {
          return true;
      }

      if (this.circles[0][0] && this.circles[1][0] && this.circles[2][0])
      {
          return true;
      }

      if (this.circles[0][1] && this.circles[1][1] && this.circles[2][1])
      {
          return true;
      }

      if (this.circles[0][2] && this.circles[0][2] && this.circles[2][2])
      {
          return true;
      }

      if (this.circles[0][0] && this.circles[1][1] && this.circles[2][2])
      {
          return true;
      }
      
      if (this.circles[2][0] && this.circles[1][1] && this.circles[0][2])
      {
          return true;
      }

      return false;
  }

  public boolean SetCross(int x, int y)
  {
      this.crosses[x][y] = true;

      if (this.crosses[0][0] && this.crosses[0][1] && this.crosses[0][2])
      {
          return true;
      }

      if (this.crosses[1][0] && this.crosses[1][1] && this.crosses[1][2])
      {
          return true;
      }

      if (this.crosses[2][0] && this.crosses[2][1] && this.crosses[2][2])
      {
          return true;
      }

      if (this.crosses[0][0] && this.crosses[1][0] && this.crosses[2][0])
      {
          return true;
      }

      if (this.crosses[0][1] && this.crosses[1][1] && this.crosses[2][1])
      {
          return true;
      }

      if (this.crosses[0][2] && this.crosses[0][2] && this.crosses[2][2])
      {
          return true;
      }

      if (this.crosses[0][0] && this.crosses[1][1] && this.crosses[2][2])
      {
          return true;
      }
      
      if (this.crosses[2][0] && this.crosses[1][1] && this.crosses[0][2])
      {
          return true;
      }

      return false;
  }
  
}