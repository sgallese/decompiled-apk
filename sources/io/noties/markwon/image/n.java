package io.noties.markwon.image;

import android.graphics.Rect;
import io.noties.markwon.image.l;

/* compiled from: ImageSizeResolverDef.java */
/* loaded from: classes4.dex */
public class n extends m {
    protected static final String UNIT_EM = "em";
    protected static final String UNIT_PERCENT = "%";

    protected int resolveAbsolute(l.a aVar, int i10, float f10) {
        throw null;
    }

    @Override // io.noties.markwon.image.m
    public Rect resolveImageSize(a aVar) {
        return resolveImageSize(aVar.b(), aVar.e().getBounds(), aVar.d(), aVar.c());
    }

    protected Rect resolveImageSize(l lVar, Rect rect, int i10, float f10) {
        if (lVar == null) {
            int width = rect.width();
            if (width > i10) {
                return new Rect(0, 0, i10, (int) ((rect.height() / (width / i10)) + 0.5f));
            }
            return rect;
        }
        rect.width();
        rect.height();
        return rect;
    }
}
