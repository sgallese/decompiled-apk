package ed;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public interface o<T> extends dd.g<T> {

    /* compiled from: ChannelFlow.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ dd.g a(o oVar, hc.f fVar, int i10, cd.a aVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    fVar = hc.g.f16601f;
                }
                if ((i11 & 2) != 0) {
                    i10 = -3;
                }
                if ((i11 & 4) != 0) {
                    aVar = cd.a.SUSPEND;
                }
                return oVar.d(fVar, i10, aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    dd.g<T> d(hc.f fVar, int i10, cd.a aVar);
}
