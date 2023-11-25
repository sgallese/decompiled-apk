package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import db.c;

/* loaded from: classes4.dex */
public class LinkSpan extends URLSpan {

    /* renamed from: f  reason: collision with root package name */
    private final c f17176f;

    /* renamed from: m  reason: collision with root package name */
    private final String f17177m;

    /* renamed from: p  reason: collision with root package name */
    private final cb.c f17178p;

    public LinkSpan(c cVar, String str, cb.c cVar2) {
        super(str);
        this.f17176f = cVar;
        this.f17177m = str;
        this.f17178p = cVar2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f17178p.a(view, this.f17177m);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        this.f17176f.g(textPaint);
    }
}
