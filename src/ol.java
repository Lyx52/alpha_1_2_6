
public class ol extends cb {

   private static nq[] bb = new nq[]{nq.u, nq.v, nq.E, nq.F, nq.aS, nq.aU, nq.aW};


   public ol(int var1, int var2) {
      super(var1, 1, var2, bb);
   }

   public boolean a(nq var1) {
      return var1 == nq.aS?true:var1 == nq.aU;
   }

}
