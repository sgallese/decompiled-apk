package w4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.coroutines.Continuation;
import w4.i;

/* compiled from: BitmapFetcher.kt */
/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f25368a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25369b;

    /* compiled from: BitmapFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a<Bitmap> {
        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Bitmap bitmap, b5.l lVar, q4.g gVar) {
            return new b(bitmap, lVar);
        }
    }

    public b(Bitmap bitmap, b5.l lVar) {
        this.f25368a = bitmap;
        this.f25369b = lVar;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        return new g(new BitmapDrawable(this.f25369b.g().getResources(), this.f25368a), false, t4.f.MEMORY);
    }
}
