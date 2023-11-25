package j0;

/* compiled from: SnapshotMutationPolicy.kt */
/* loaded from: classes.dex */
final class d2 implements x2<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static final d2 f18632a = new d2();

    private d2() {
    }

    @Override // j0.x2
    public boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return false;
    }

    @Override // j0.x2
    public /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        return w2.a(this, obj, obj2, obj3);
    }

    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
