package okhttp3.internal.cache;

import dc.w;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes4.dex */
final class DiskLruCache$Editor$newSink$1$1 extends r implements l<IOException, w> {
    final /* synthetic */ DiskLruCache this$0;
    final /* synthetic */ DiskLruCache.Editor this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$1$1(DiskLruCache diskLruCache, DiskLruCache.Editor editor) {
        super(1);
        this.this$0 = diskLruCache;
        this.this$1 = editor;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(IOException iOException) {
        invoke2(iOException);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        q.i(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        DiskLruCache.Editor editor = this.this$1;
        synchronized (diskLruCache) {
            editor.detach$okhttp();
            w wVar = w.f13270a;
        }
    }
}
