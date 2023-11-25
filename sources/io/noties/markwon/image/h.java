package io.noties.markwon.image;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;

/* compiled from: DefaultMediaDecoder.java */
/* loaded from: classes4.dex */
public class h extends q {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f17218a;

    h(Resources resources) {
        this.f17218a = resources;
    }

    public static h c() {
        return new h(Resources.getSystem());
    }

    @Override // io.noties.markwon.image.q
    public Drawable a(String str, InputStream inputStream) {
        try {
            return new BitmapDrawable(this.f17218a, BitmapFactory.decodeStream(inputStream));
        } catch (Throwable th) {
            throw new IllegalStateException("Exception decoding input-stream", th);
        }
    }

    @Override // io.noties.markwon.image.q
    public Collection<String> b() {
        return Collections.emptySet();
    }
}
