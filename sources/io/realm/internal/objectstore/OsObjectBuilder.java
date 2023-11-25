package io.realm.internal.objectstore;

import io.realm.a1;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.x0;
import java.io.Closeable;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes4.dex */
public class OsObjectBuilder implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    private final Table f17853f;

    /* renamed from: m  reason: collision with root package name */
    private final long f17854m;

    /* renamed from: p  reason: collision with root package name */
    private final long f17855p;

    /* renamed from: q  reason: collision with root package name */
    private final long f17856q;

    /* renamed from: r  reason: collision with root package name */
    private final io.realm.internal.g f17857r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f17858s;

    /* renamed from: t  reason: collision with root package name */
    private static s0<? extends a1> f17846t = new k();

    /* renamed from: u  reason: collision with root package name */
    private static s0<String> f17847u = new v();

    /* renamed from: v  reason: collision with root package name */
    private static s0<Byte> f17848v = new g0();

    /* renamed from: w  reason: collision with root package name */
    private static s0<Short> f17849w = new m0();

    /* renamed from: x  reason: collision with root package name */
    private static s0<Integer> f17850x = new n0();

    /* renamed from: y  reason: collision with root package name */
    private static s0<Long> f17851y = new o0();

    /* renamed from: z  reason: collision with root package name */
    private static s0<Boolean> f17852z = new p0();
    private static s0<Float> A = new q0();
    private static s0<Double> B = new r0();
    private static s0<Date> C = new a();
    private static s0<byte[]> D = new b();
    private static s0<io.realm.z> E = new c();
    private static s0<Decimal128> F = new d();
    private static s0<ObjectId> G = new e();
    private static s0<UUID> H = new f();
    private static s0<Map.Entry<String, Boolean>> I = new g();
    private static s0<Map.Entry<String, String>> J = new h();
    private static s0<Map.Entry<String, Integer>> K = new i();
    private static s0<Map.Entry<String, Float>> L = new j();
    private static s0<Map.Entry<String, Long>> M = new l();
    private static s0<Map.Entry<String, Short>> N = new m();
    private static s0<Map.Entry<String, Byte>> O = new n();
    private static s0<Map.Entry<String, Double>> P = new o();
    private static s0<Map.Entry<String, byte[]>> Q = new p();
    private static s0<Map.Entry<String, Date>> R = new q();
    private static s0<Map.Entry<String, Decimal128>> S = new r();
    private static s0<Map.Entry<String, ObjectId>> T = new s();
    private static s0<Map.Entry<String, UUID>> U = new t();
    private static s0<Map.Entry<String, io.realm.p0>> V = new u();
    private static s0<io.realm.p0> W = new w();
    private static s0<String> X = new x();
    private static s0<Boolean> Y = new y();
    private static s0<Integer> Z = new z();

    /* renamed from: a0  reason: collision with root package name */
    private static s0<Long> f17835a0 = new a0();

    /* renamed from: b0  reason: collision with root package name */
    private static s0<Short> f17836b0 = new b0();

    /* renamed from: c0  reason: collision with root package name */
    private static s0<Byte> f17837c0 = new c0();

    /* renamed from: d0  reason: collision with root package name */
    private static s0<Float> f17838d0 = new d0();

    /* renamed from: e0  reason: collision with root package name */
    private static s0<Double> f17839e0 = new e0();

    /* renamed from: f0  reason: collision with root package name */
    private static s0<byte[]> f17840f0 = new f0();

    /* renamed from: g0  reason: collision with root package name */
    private static s0<Date> f17841g0 = new h0();

    /* renamed from: h0  reason: collision with root package name */
    private static s0<Decimal128> f17842h0 = new i0();

    /* renamed from: i0  reason: collision with root package name */
    private static s0<ObjectId> f17843i0 = new j0();

    /* renamed from: j0  reason: collision with root package name */
    private static s0<UUID> f17844j0 = new k0();

    /* renamed from: k0  reason: collision with root package name */
    private static s0<io.realm.p0> f17845k0 = new l0();

    /* loaded from: classes4.dex */
    class a implements s0<Date> {
        a() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Date date) {
            OsObjectBuilder.nativeAddDateListItem(j10, date.getTime());
        }
    }

    /* loaded from: classes4.dex */
    class a0 implements s0<Long> {
        a0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Long l10) {
            OsObjectBuilder.nativeAddIntegerSetItem(j10, l10.longValue());
        }
    }

    /* loaded from: classes4.dex */
    class b implements s0<byte[]> {
        b() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArrayListItem(j10, bArr);
        }
    }

    /* loaded from: classes4.dex */
    class b0 implements s0<Short> {
        b0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Short sh) {
            OsObjectBuilder.nativeAddIntegerSetItem(j10, sh.shortValue());
        }
    }

    /* loaded from: classes4.dex */
    class c implements s0<io.realm.z> {
        c() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, io.realm.z zVar) {
            Long d10 = zVar.d();
            if (d10 == null) {
                OsObjectBuilder.nativeAddNullListItem(j10);
            } else {
                OsObjectBuilder.nativeAddIntegerListItem(j10, d10.longValue());
            }
        }
    }

    /* loaded from: classes4.dex */
    class c0 implements s0<Byte> {
        c0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Byte b10) {
            OsObjectBuilder.nativeAddIntegerSetItem(j10, b10.byteValue());
        }
    }

    /* loaded from: classes4.dex */
    class d implements s0<Decimal128> {
        d() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128ListItem(j10, decimal128.j(), decimal128.i());
        }
    }

    /* loaded from: classes4.dex */
    class d0 implements s0<Float> {
        d0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Float f10) {
            OsObjectBuilder.nativeAddFloatSetItem(j10, f10.floatValue());
        }
    }

    /* loaded from: classes4.dex */
    class e implements s0<ObjectId> {
        e() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdListItem(j10, objectId.toString());
        }
    }

    /* loaded from: classes4.dex */
    class e0 implements s0<Double> {
        e0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Double d10) {
            OsObjectBuilder.nativeAddDoubleSetItem(j10, d10.doubleValue());
        }
    }

    /* loaded from: classes4.dex */
    class f implements s0<UUID> {
        f() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDListItem(j10, uuid.toString());
        }
    }

    /* loaded from: classes4.dex */
    class f0 implements s0<byte[]> {
        f0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, byte[] bArr) {
            OsObjectBuilder.nativeAddByteArraySetItem(j10, bArr);
        }
    }

    /* loaded from: classes4.dex */
    class g implements s0<Map.Entry<String, Boolean>> {
        g() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Boolean> entry) {
            OsObjectBuilder.nativeAddBooleanDictionaryEntry(j10, entry.getKey(), entry.getValue().booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    class g0 implements s0<Byte> {
        g0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Byte b10) {
            OsObjectBuilder.nativeAddIntegerListItem(j10, b10.longValue());
        }
    }

    /* loaded from: classes4.dex */
    class h implements s0<Map.Entry<String, String>> {
        h() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, String> entry) {
            OsObjectBuilder.nativeAddStringDictionaryEntry(j10, entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements s0<Date> {
        h0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Date date) {
            OsObjectBuilder.nativeAddDateSetItem(j10, date.getTime());
        }
    }

    /* loaded from: classes4.dex */
    class i implements s0<Map.Entry<String, Integer>> {
        i() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Integer> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j10, entry.getKey(), entry.getValue().intValue());
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements s0<Decimal128> {
        i0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Decimal128 decimal128) {
            OsObjectBuilder.nativeAddDecimal128SetItem(j10, decimal128.j(), decimal128.i());
        }
    }

    /* loaded from: classes4.dex */
    class j implements s0<Map.Entry<String, Float>> {
        j() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Float> entry) {
            OsObjectBuilder.nativeAddFloatDictionaryEntry(j10, entry.getKey(), entry.getValue().floatValue());
        }
    }

    /* loaded from: classes4.dex */
    class j0 implements s0<ObjectId> {
        j0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, ObjectId objectId) {
            OsObjectBuilder.nativeAddObjectIdSetItem(j10, objectId.toString());
        }
    }

    /* loaded from: classes4.dex */
    class k implements s0<a1> {
        k() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, a1 a1Var) {
            OsObjectBuilder.nativeAddIntegerListItem(j10, ((UncheckedRow) ((io.realm.internal.o) a1Var).b().g()).getNativePtr());
        }
    }

    /* loaded from: classes4.dex */
    class k0 implements s0<UUID> {
        k0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, UUID uuid) {
            OsObjectBuilder.nativeAddUUIDSetItem(j10, uuid.toString());
        }
    }

    /* loaded from: classes4.dex */
    class l implements s0<Map.Entry<String, Long>> {
        l() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Long> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j10, entry.getKey(), entry.getValue().longValue());
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements s0<io.realm.p0> {

        /* renamed from: a  reason: collision with root package name */
        private final io.realm.internal.m f17859a = new io.realm.r0();

        l0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, io.realm.p0 p0Var) {
            this.f17859a.b(j10, p0Var);
        }
    }

    /* loaded from: classes4.dex */
    class m implements s0<Map.Entry<String, Short>> {
        m() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Short> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j10, entry.getKey(), entry.getValue().shortValue());
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements s0<Short> {
        m0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Short sh) {
            OsObjectBuilder.nativeAddIntegerListItem(j10, sh.shortValue());
        }
    }

    /* loaded from: classes4.dex */
    class n implements s0<Map.Entry<String, Byte>> {
        n() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Byte> entry) {
            OsObjectBuilder.nativeAddIntegerDictionaryEntry(j10, entry.getKey(), entry.getValue().byteValue());
        }
    }

    /* loaded from: classes4.dex */
    class n0 implements s0<Integer> {
        n0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Integer num) {
            OsObjectBuilder.nativeAddIntegerListItem(j10, num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    class o implements s0<Map.Entry<String, Double>> {
        o() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Double> entry) {
            OsObjectBuilder.nativeAddDoubleDictionaryEntry(j10, entry.getKey(), entry.getValue().doubleValue());
        }
    }

    /* loaded from: classes4.dex */
    class o0 implements s0<Long> {
        o0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Long l10) {
            OsObjectBuilder.nativeAddIntegerListItem(j10, l10.longValue());
        }
    }

    /* loaded from: classes4.dex */
    class p implements s0<Map.Entry<String, byte[]>> {
        p() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, byte[]> entry) {
            OsObjectBuilder.nativeAddBinaryDictionaryEntry(j10, entry.getKey(), entry.getValue());
        }
    }

    /* loaded from: classes4.dex */
    class p0 implements s0<Boolean> {
        p0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanListItem(j10, bool.booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    class q implements s0<Map.Entry<String, Date>> {
        q() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Date> entry) {
            OsObjectBuilder.nativeAddDateDictionaryEntry(j10, entry.getKey(), entry.getValue().getTime());
        }
    }

    /* loaded from: classes4.dex */
    class q0 implements s0<Float> {
        q0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Float f10) {
            OsObjectBuilder.nativeAddFloatListItem(j10, f10.floatValue());
        }
    }

    /* loaded from: classes4.dex */
    class r implements s0<Map.Entry<String, Decimal128>> {
        r() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, Decimal128> entry) {
            OsObjectBuilder.nativeAddDecimal128DictionaryEntry(j10, entry.getKey(), entry.getValue().i(), entry.getValue().j());
        }
    }

    /* loaded from: classes4.dex */
    class r0 implements s0<Double> {
        r0() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Double d10) {
            OsObjectBuilder.nativeAddDoubleListItem(j10, d10.doubleValue());
        }
    }

    /* loaded from: classes4.dex */
    class s implements s0<Map.Entry<String, ObjectId>> {
        s() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, ObjectId> entry) {
            OsObjectBuilder.nativeAddObjectIdDictionaryEntry(j10, entry.getKey(), entry.getValue().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface s0<T> {
        void a(long j10, T t10);
    }

    /* loaded from: classes4.dex */
    class t implements s0<Map.Entry<String, UUID>> {
        t() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, UUID> entry) {
            OsObjectBuilder.nativeAddUUIDDictionaryEntry(j10, entry.getKey(), entry.getValue().toString());
        }
    }

    /* loaded from: classes4.dex */
    class u implements s0<Map.Entry<String, io.realm.p0>> {

        /* renamed from: a  reason: collision with root package name */
        private final io.realm.internal.m f17860a = new io.realm.r0();

        u() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Map.Entry<String, io.realm.p0> entry) {
            this.f17860a.a(j10, entry);
        }
    }

    /* loaded from: classes4.dex */
    class v implements s0<String> {
        v() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, String str) {
            OsObjectBuilder.nativeAddStringListItem(j10, str);
        }
    }

    /* loaded from: classes4.dex */
    class w implements s0<io.realm.p0> {

        /* renamed from: a  reason: collision with root package name */
        private final io.realm.internal.m f17861a = new io.realm.r0();

        w() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, io.realm.p0 p0Var) {
            this.f17861a.b(j10, p0Var);
        }
    }

    /* loaded from: classes4.dex */
    class x implements s0<String> {
        x() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, String str) {
            OsObjectBuilder.nativeAddStringSetItem(j10, str);
        }
    }

    /* loaded from: classes4.dex */
    class y implements s0<Boolean> {
        y() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Boolean bool) {
            OsObjectBuilder.nativeAddBooleanSetItem(j10, bool.booleanValue());
        }
    }

    /* loaded from: classes4.dex */
    class z implements s0<Integer> {
        z() {
        }

        @Override // io.realm.internal.objectstore.OsObjectBuilder.s0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(long j10, Integer num) {
            OsObjectBuilder.nativeAddIntegerSetItem(j10, num.intValue());
        }
    }

    public OsObjectBuilder(Table table, Set<io.realm.v> set) {
        OsSharedRealm q10 = table.q();
        this.f17854m = q10.getNativePtr();
        this.f17853f = table;
        table.m();
        this.f17856q = table.getNativePtr();
        this.f17855p = nativeCreateBuilder();
        this.f17857r = q10.context;
        this.f17858s = set.contains(io.realm.v.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private void R0(long j10) {
        nativeStopList(this.f17855p, j10, nativeStartList(0L));
    }

    private <T> void Y0(long j10, long j11, List<T> list, s0<T> s0Var) {
        boolean z10;
        if (list != null) {
            long nativeStartList = nativeStartList(list.size());
            if (j11 != 0 && !this.f17853f.u(j11)) {
                z10 = false;
            } else {
                z10 = true;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                T t10 = list.get(i10);
                if (t10 == null) {
                    if (z10) {
                        nativeAddNullListItem(nativeStartList);
                    } else {
                        throw new IllegalArgumentException("This 'RealmList' is not nullable. A non-null value is expected.");
                    }
                } else {
                    s0Var.a(nativeStartList, t10);
                }
            }
            nativeStopList(j10, j11, nativeStartList);
            return;
        }
        R0(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBinaryDictionaryEntry(long j10, String str, byte[] bArr);

    private static native void nativeAddBoolean(long j10, long j11, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanDictionaryEntry(long j10, String str, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanListItem(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddBooleanSetItem(long j10, boolean z10);

    private static native void nativeAddByteArray(long j10, long j11, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArrayListItem(long j10, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddByteArraySetItem(long j10, byte[] bArr);

    private static native void nativeAddDate(long j10, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateDictionaryEntry(long j10, String str, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateListItem(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDateSetItem(long j10, long j11);

    private static native void nativeAddDecimal128(long j10, long j11, long j12, long j13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128DictionaryEntry(long j10, String str, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128ListItem(long j10, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDecimal128SetItem(long j10, long j11, long j12);

    private static native void nativeAddDouble(long j10, long j11, double d10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleDictionaryEntry(long j10, String str, double d10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleListItem(long j10, double d10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddDoubleSetItem(long j10, double d10);

    private static native void nativeAddFloat(long j10, long j11, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatDictionaryEntry(long j10, String str, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatListItem(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddFloatSetItem(long j10, float f10);

    private static native void nativeAddInteger(long j10, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerDictionaryEntry(long j10, String str, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerListItem(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddIntegerSetItem(long j10, long j11);

    private static native void nativeAddNull(long j10, long j11);

    private static native void nativeAddNullDictionaryEntry(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddNullListItem(long j10);

    private static native void nativeAddNullSetItem(long j10);

    private static native void nativeAddObject(long j10, long j11, long j12);

    private static native void nativeAddObjectDictionaryEntry(long j10, String str, long j11);

    private static native void nativeAddObjectId(long j10, long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdDictionaryEntry(long j10, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdListItem(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddObjectIdSetItem(long j10, String str);

    private static native void nativeAddObjectList(long j10, long j11, long[] jArr);

    private static native void nativeAddObjectListItem(long j10, long j11);

    private static native void nativeAddRealmAny(long j10, long j11, long j12);

    public static native void nativeAddRealmAnyDictionaryEntry(long j10, String str, long j11);

    public static native void nativeAddRealmAnyListItem(long j10, long j11);

    private static native void nativeAddString(long j10, long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringDictionaryEntry(long j10, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringListItem(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddStringSetItem(long j10, String str);

    private static native void nativeAddUUID(long j10, long j11, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDDictionaryEntry(long j10, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDListItem(long j10, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddUUIDSetItem(long j10, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j10, long j11, long j12, boolean z10, boolean z11);

    private static native void nativeDestroyBuilder(long j10);

    private static native long nativeStartDictionary();

    private static native long nativeStartList(long j10);

    private static native long nativeStartSet(long j10);

    private static native void nativeStopDictionary(long j10, long j11, long j12);

    private static native void nativeStopList(long j10, long j11, long j12);

    private static native void nativeStopSet(long j10, long j11, long j12);

    private static native long nativeUpdateEmbeddedObject(long j10, long j11, long j12, long j13, boolean z10);

    public void F0(long j10, Boolean bool) {
        if (bool == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddBoolean(this.f17855p, j10, bool.booleanValue());
        }
    }

    public void I0(long j10, Date date) {
        if (date == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddDate(this.f17855p, j10, date.getTime());
        }
    }

    public void J0(long j10, x0<Date> x0Var) {
        Y0(this.f17855p, j10, x0Var, C);
    }

    public void N0(long j10, Double d10) {
        if (d10 == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddDouble(this.f17855p, j10, d10.doubleValue());
        }
    }

    public void T0(long j10, Float f10) {
        if (f10 == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddFloat(this.f17855p, j10, f10.floatValue());
        }
    }

    public void V0(long j10, Integer num) {
        if (num == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddInteger(this.f17855p, j10, num.intValue());
        }
    }

    public void X0(long j10, Long l10) {
        if (l10 == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddInteger(this.f17855p, j10, l10.longValue());
        }
    }

    public void Z0(long j10) {
        nativeAddNull(this.f17855p, j10);
    }

    public void a1(long j10, a1 a1Var) {
        if (a1Var == null) {
            nativeAddNull(this.f17855p, j10);
            return;
        }
        nativeAddObject(this.f17855p, j10, ((UncheckedRow) ((io.realm.internal.o) a1Var).b().g()).getNativePtr());
    }

    public <T extends a1> void b1(long j10, x0<T> x0Var) {
        if (x0Var != null) {
            long[] jArr = new long[x0Var.size()];
            for (int i10 = 0; i10 < x0Var.size(); i10++) {
                io.realm.internal.o oVar = (io.realm.internal.o) x0Var.get(i10);
                if (oVar != null) {
                    jArr[i10] = ((UncheckedRow) oVar.b().g()).getNativePtr();
                } else {
                    throw new IllegalArgumentException("Null values are not allowed in RealmLists containing Realm models");
                }
            }
            nativeAddObjectList(this.f17855p, j10, jArr);
            return;
        }
        nativeAddObjectList(this.f17855p, j10, new long[0]);
    }

    public void c1(long j10, String str) {
        if (str == null) {
            nativeAddNull(this.f17855p, j10);
        } else {
            nativeAddString(this.f17855p, j10, str);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.f17855p);
    }

    public void d1(long j10, x0<String> x0Var) {
        Y0(this.f17855p, j10, x0Var, f17847u);
    }

    public UncheckedRow e1() {
        try {
            return new UncheckedRow(this.f17857r, this.f17853f, nativeCreateOrUpdateTopLevelObject(this.f17854m, this.f17856q, this.f17855p, false, false));
        } finally {
            close();
        }
    }

    public void f1(io.realm.internal.o oVar) {
        try {
            nativeUpdateEmbeddedObject(this.f17854m, this.f17856q, this.f17855p, oVar.b().g().getObjectKey(), this.f17858s);
        } finally {
            close();
        }
    }

    public void g1() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f17854m, this.f17856q, this.f17855p, true, this.f17858s);
        } finally {
            close();
        }
    }
}
