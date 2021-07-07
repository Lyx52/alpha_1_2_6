import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class en {

   private static final en a = new en();
   private List b = new ArrayList();


   public static final en a() {
      return a;
   }

   private en() {
      (new eg()).a(this);
      (new pa()).a(this);
      (new mv()).a(this);
      (new iw()).a(this);
      (new gf()).a(this);
      (new o()).a(this);
      this.a(new fp(dx.aI, 3), new Object[]{"###", Character.valueOf('#'), dx.aH});
      this.a(new fp(dx.aJ, 1), new Object[]{"#", "#", "#", Character.valueOf('#'), dx.aI});
      this.a(new fp(nq.aZ, 2), new Object[]{"###", "###", Character.valueOf('#'), dx.B});
      this.a(new fp(nq.aY, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), nq.x, Character.valueOf('X'), dx.l});
      this.a(new fp(nq.an, 1), new Object[]{"###", "XXX", "###", Character.valueOf('#'), nq.x, Character.valueOf('X'), dx.aJ});
      this.a(new fp(nq.aU, 1), new Object[]{"##", "##", Character.valueOf('#'), dx.aB});
      this.a(new fp(nq.aW, 1), new Object[]{"##", "##", Character.valueOf('#'), dx.aG});
      this.a(new fp(nq.al, 1), new Object[]{"##", "##", Character.valueOf('#'), dx.aF});
      this.a(new fp(nq.bd, 1), new Object[]{"###", "###", "###", Character.valueOf('#'), dx.aR});
      this.a(new fp(nq.ab, 1), new Object[]{"###", "###", "###", Character.valueOf('#'), dx.I});
      this.a(new fp(nq.am, 1), new Object[]{"X#X", "#X#", "X#X", Character.valueOf('X'), dx.K, Character.valueOf('#'), nq.E});
      this.a(new fp(nq.ak, 3), new Object[]{"###", Character.valueOf('#'), nq.w});
      this.a(new fp(nq.aF, 1), new Object[]{"# #", "###", "# #", Character.valueOf('#'), dx.B});
      this.a(new fp(dx.at, 1), new Object[]{"##", "##", "##", Character.valueOf('#'), nq.x});
      this.a(new fp(dx.az, 1), new Object[]{"##", "##", "##", Character.valueOf('#'), dx.m});
      this.a(new fp(dx.as, 1), new Object[]{"###", "###", " X ", Character.valueOf('#'), nq.x, Character.valueOf('X'), dx.B});
      this.a(new fp(nq.x, 4), new Object[]{"#", Character.valueOf('#'), nq.J});
      this.a(new fp(dx.B, 4), new Object[]{"#", "#", Character.valueOf('#'), nq.x});
      this.a(new fp(nq.aq, 4), new Object[]{"X", "#", Character.valueOf('X'), dx.k, Character.valueOf('#'), dx.B});
      this.a(new fp(dx.C, 4), new Object[]{"# #", " # ", Character.valueOf('#'), nq.x});
      this.a(new fp(nq.aG, 16), new Object[]{"X X", "X#X", "X X", Character.valueOf('X'), dx.m, Character.valueOf('#'), dx.B});
      this.a(new fp(dx.ax, 1), new Object[]{"# #", "###", Character.valueOf('#'), dx.m});
      this.a(new fp(nq.bf, 1), new Object[]{"A", "B", Character.valueOf('A'), nq.ba, Character.valueOf('B'), nq.aq});
      this.a(new fp(dx.aL, 1), new Object[]{"A", "B", Character.valueOf('A'), nq.au, Character.valueOf('B'), dx.ax});
      this.a(new fp(dx.aM, 1), new Object[]{"A", "B", Character.valueOf('A'), nq.aB, Character.valueOf('B'), dx.ax});
      this.a(new fp(dx.aC, 1), new Object[]{"# #", "###", Character.valueOf('#'), nq.x});
      this.a(new fp(dx.au, 1), new Object[]{"# #", " # ", Character.valueOf('#'), dx.m});
      this.a(new fp(dx.g, 1), new Object[]{"A ", " B", Character.valueOf('A'), dx.m, Character.valueOf('B'), dx.an});
      this.a(new fp(dx.S, 1), new Object[]{"###", Character.valueOf('#'), dx.R});
      this.a(new fp(nq.at, 4), new Object[]{"#  ", "## ", "###", Character.valueOf('#'), nq.x});
      this.a(new fp(dx.aP, 1), new Object[]{"  #", " #X", "# X", Character.valueOf('#'), dx.B, Character.valueOf('X'), dx.I});
      this.a(new fp(nq.aH, 4), new Object[]{"#  ", "## ", "###", Character.valueOf('#'), nq.w});
      this.a(new fp(dx.aq, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), dx.B, Character.valueOf('X'), nq.ab});
      this.a(new fp(dx.ar, 1), new Object[]{"###", "#X#", "###", Character.valueOf('#'), nq.ah, Character.valueOf('X'), dx.h});
      this.a(new fp(nq.aJ, 1), new Object[]{"X", "#", Character.valueOf('#'), nq.w, Character.valueOf('X'), dx.B});
      this.a(new fp(nq.aQ, 1), new Object[]{"X", "#", Character.valueOf('#'), dx.B, Character.valueOf('X'), dx.aA});
      this.a(new fp(dx.aQ, 1), new Object[]{" # ", "#X#", " # ", Character.valueOf('#'), dx.n, Character.valueOf('X'), dx.aA});
      this.a(new fp(dx.aO, 1), new Object[]{" # ", "#X#", " # ", Character.valueOf('#'), dx.m, Character.valueOf('X'), dx.aA});
      this.a(new fp(nq.aR, 1), new Object[]{"#", "#", Character.valueOf('#'), nq.t});
      this.a(new fp(nq.aK, 1), new Object[]{"###", Character.valueOf('#'), nq.t});
      this.a(new fp(nq.aM, 1), new Object[]{"###", Character.valueOf('#'), nq.x});
      Collections.sort(this.b, new gr(this));
      System.out.println(this.b.size() + " recipes");
   }

   void a(fp var1, Object ... var2) {
      String var3 = "";
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      if(var2[var4] instanceof String[]) {
         String[] var7 = (String[])((String[])var2[var4++]);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            String var9 = var7[var8];
            ++var6;
            var5 = var9.length();
            var3 = var3 + var9;
         }
      } else {
         while(var2[var4] instanceof String) {
            String var11 = (String)var2[var4++];
            ++var6;
            var5 = var11.length();
            var3 = var3 + var11;
         }
      }

      HashMap var12;
      int var15;
      for(var12 = new HashMap(); var4 < var2.length; var4 += 2) {
         Character var13 = (Character)var2[var4];
         var15 = 0;
         if(var2[var4 + 1] instanceof dx) {
            var15 = ((dx)var2[var4 + 1]).aW;
         } else if(var2[var4 + 1] instanceof nq) {
            var15 = ((nq)var2[var4 + 1]).bh;
         }

         var12.put(var13, Integer.valueOf(var15));
      }

      int[] var14 = new int[var5 * var6];

      for(var15 = 0; var15 < var5 * var6; ++var15) {
         char var10 = var3.charAt(var15);
         if(var12.containsKey(Character.valueOf(var10))) {
            var14[var15] = ((Integer)var12.get(Character.valueOf(var10))).intValue();
         } else {
            var14[var15] = -1;
         }
      }

      this.b.add(new cd(var5, var6, var14, var1));
   }

   public fp a(int[] var1) {
      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         cd var3 = (cd)this.b.get(var2);
         if(var3.a(var1)) {
            return var3.b(var1);
         }
      }

      return null;
   }

}
