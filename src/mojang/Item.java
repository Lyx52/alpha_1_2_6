package mojang;

import mojang.entity.Entity;
import mojang.entity.LivingEntity;
import mojang.world.World;

import java.util.Random;

public class Item {

   protected static Random b = new Random();
   public static Item[] itemIds = new Item[32000];
   public static Item d = (new ol(0, 2)).a(82);
   public static Item e = (new ac(1, 2)).a(98);
   public static Item f = (new mg(2, 2)).a(114);
   public static Item g = (new pw(3)).a(5);
   public static Item h = (new qk(4, 4)).a(10);
   public static Item i = (new kt(5)).a(21);
   public static Item j = (new Item(6)).a(37);
   public static Item k = (new Item(7)).a(7);
   public static Item l = (new Item(8)).a(55);
   public static Item m = (new Item(9)).a(23);
   public static Item n = (new Item(10)).a(39);
   public static Item o = (new kg(11, 2)).a(66);
   public static Item p = (new kg(12, 0)).a(64);
   public static Item q = (new ol(13, 0)).a(80);
   public static Item r = (new ac(14, 0)).a(96);
   public static Item s = (new mg(15, 0)).a(112);
   public static Item t = (new kg(16, 1)).a(65);
   public static Item u = (new ol(17, 1)).a(81);
   public static Item v = (new ac(18, 1)).a(97);
   public static Item w = (new mg(19, 1)).a(113);
   public static Item x = (new kg(20, 3)).a(67);
   public static Item y = (new ol(21, 3)).a(83);
   public static Item z = (new ac(22, 3)).a(99);
   public static Item A = (new mg(23, 3)).a(115);
   public static Item B = (new Item(24)).a(53).e();
   public static Item C = (new Item(25)).a(71);
   public static Item D = (new au(26, 10)).a(72);
   public static Item E = (new kg(27, 0)).a(68);
   public static Item F = (new ol(28, 0)).a(84);
   public static Item G = (new ac(29, 0)).a(100);
   public static Item H = (new mg(30, 0)).a(116);
   public static Item I = (new Item(31)).a(8);
   public static Item J = (new Item(32)).a(24);
   public static Item K = (new Item(33)).a(40);
   public static Item L = (new gt(34, 0)).a(128);
   public static Item M = (new gt(35, 1)).a(129);
   public static Item N = (new gt(36, 2)).a(130);
   public static Item O = (new gt(37, 3)).a(131);
   public static Item P = (new gt(38, 1)).a(132);
   public static Item Q = (new la(39, nq.az.bh)).a(9);
   public static Item R = (new Item(40)).a(25);
   public static Item S = (new qk(41, 5)).a(41);
   public static Item T = (new oj(42, 0, 0, 0)).a(0);
   public static Item U = (new oj(43, 0, 0, 1)).a(16);
   public static Item V = (new oj(44, 0, 0, 2)).a(32);
   public static Item W = (new oj(45, 0, 0, 3)).a(48);
   public static Item X = (new oj(46, 1, 1, 0)).a(1);
   public static Item Y = (new oj(47, 1, 1, 1)).a(17);
   public static Item Z = (new oj(48, 1, 1, 2)).a(33);
   public static Item aa = (new oj(49, 1, 1, 3)).a(49);
   public static Item ab = (new oj(50, 2, 2, 0)).a(2);
   public static Item ac = (new oj(51, 2, 2, 1)).a(18);
   public static Item ad = (new oj(52, 2, 2, 2)).a(34);
   public static Item ae = (new oj(53, 2, 2, 3)).a(50);
   public static Item af = (new oj(54, 3, 3, 0)).a(3);
   public static Item ag = (new oj(55, 3, 3, 1)).a(19);
   public static Item ah = (new oj(56, 3, 3, 2)).a(35);
   public static Item ai = (new oj(57, 3, 3, 3)).a(51);
   public static Item aj = (new oj(58, 1, 4, 0)).a(4);
   public static Item ak = (new oj(59, 1, 4, 1)).a(20);
   public static Item al = (new oj(60, 1, 4, 2)).a(36);
   public static Item am = (new oj(61, 1, 4, 3)).a(52);
   public static Item an = (new Item(62)).a(6);
   public static Item ao = (new qk(63, 3)).a(87);
   public static Item ap = (new qk(64, 8)).a(88);
   public static Item aq = (new qe(65)).a(26);
   public static Item ar = (new qk(66, 42)).a(11);
   public static Item as = (new nv(67)).a(42);
   public static Item at = (new eu(68, hb.c)).a(43);
   public static Item au = (new ag(69, 0)).a(74);
   public static Item av = (new ag(70, nq.A.bh)).a(75);
   public static Item aw = (new ag(71, nq.C.bh)).a(76);
   public static Item ax = (new lb(72, 0)).a(135);
   public static Item ay = (new lk(73)).a(104);
   public static Item az = (new eu(74, hb.e)).a(44);
   public static Item aA = (new ey(75)).a(56);
   public static Item aB = (new by(76)).a(14);
   public static Item aC = (new nw(77)).a(136);
   public static Item aD = (new Item(78)).a(103);
   public static Item aE = (new ag(79, -1)).a(77);
   public static Item aF = (new Item(80)).a(22);
   public static Item aG = (new Item(81)).a(57);
   public static Item aH = (new hh(82, nq.aX)).a(27);
   public static Item aI = (new Item(83)).a(58);
   public static Item aJ = (new Item(84)).a(59);
   public static Item aK = (new Item(85)).a(30);
   public static Item aL = (new lb(86, 1)).a(151);
   public static Item aM = (new lb(87, 2)).a(167);
   public static Item aN = (new Item(88)).a(12);
   public static Item aO = (new Item(89)).a(54);
   public static Item aP = (new Bow(90)).a(69);
   public static Item aQ = (new Item(91)).a(70);
   public static Item aR = (new Item(92)).a(73);
   public static Item aS = (new qk(93, 2)).a(89);
   public static Item aT = (new qk(94, 5)).a(90);
   public static Item MUSIC_DISC_13 = (new MusicDisc(2000, "13")).a(240);
   public static Item MUSIC_DISC_CAT = (new MusicDisc(2001, "cat")).a(241);
   public final int aW;
   protected int aX = 64;
   protected int aY = 32;
   protected int aZ;
   protected boolean ba = false;


   protected Item(int itemID) {
      this.aW = 256 + itemID;
      if(itemIds[256 + itemID] != null) {
         System.out.println("CONFLICT @ " + itemID);
      }

      itemIds[256 + itemID] = this;
   }

   public Item a(int var1) {
      this.aZ = var1;
      return this;
   }

   public int a(fp var1) {
      return this.aZ;
   }

   public boolean a(fp var1, eb var2, World var3, int var4, int var5, int var6, int var7) {
      return false;
   }

   public float a(fp var1, nq var2) {
      return 1.0F;
   }

   public fp a(fp var1, World var2, eb var3) {
      return var1;
   }

   public int c() {
      return this.aX;
   }

   public int d() {
      return this.aY;
   }

   public void a(fp var1, LivingEntity var2) {}

   public void a(fp var1, int var2, int var3, int var4, int var5) {}

   public int a(Entity var1) {
      return 1;
   }

   public boolean a(nq var1) {
      return false;
   }

   public void b(fp var1, LivingEntity var2) {}

   public Item e() {
      this.ba = true;
      return this;
   }

   public boolean a() {
      return this.ba;
   }

   public boolean b() {
      return false;
   }

}
