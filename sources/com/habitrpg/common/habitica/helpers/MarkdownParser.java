package com.habitrpg.common.habitica.helpers;

import ad.a1;
import ad.l0;
import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import cb.g;
import dc.l;
import dc.w;
import ec.m0;
import io.noties.markwon.image.n;
import io.noties.markwon.image.p;
import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qc.q;
import yc.j;

/* compiled from: MarkdownParser.kt */
/* loaded from: classes4.dex */
public final class MarkdownParser {
    public static final MarkdownParser INSTANCE = new MarkdownParser();
    private static final SortedMap<Integer, Spanned> cache;
    private static final j imageMarkdownRegex;
    private static final j markdownLinkRegex;
    private static final j markdownRegex;
    private static cb.e markwon;

    static {
        SortedMap<Integer, Spanned> f10;
        f10 = m0.f(new l[0]);
        cache = f10;
        markdownRegex = new j(".*[*#_\\[`~].*");
        imageMarkdownRegex = new j("!\\[.*?]\\(.*?\".*?\"\\)");
        markdownLinkRegex = new j("\\[([^\\]]+)\\]\\(([^\\)]+)\\)");
    }

    private MarkdownParser() {
    }

    private final cb.i createImageSizeResolverScaleDpiPlugin(final Context context) {
        return new cb.a() { // from class: com.habitrpg.common.habitica.helpers.MarkdownParser$createImageSizeResolverScaleDpiPlugin$1
            @Override // cb.a, cb.i
            public void configureConfiguration(g.b bVar) {
                q.i(bVar, "builder");
                final Context context2 = context;
                bVar.j(new n() { // from class: com.habitrpg.common.habitica.helpers.MarkdownParser$createImageSizeResolverScaleDpiPlugin$1$configureConfiguration$1
                    @Override // io.noties.markwon.image.n
                    protected Rect resolveImageSize(io.noties.markwon.image.l lVar, Rect rect, int i10, float f10) {
                        q.i(rect, "imageBounds");
                        float f11 = context2.getResources().getDisplayMetrics().density;
                        int width = rect.width();
                        if (f11 > 1.0f) {
                            width = (int) (f11 * width);
                        }
                        if (width <= i10) {
                            i10 = width;
                        }
                        return new Rect(0, 0, i10, (int) ((i10 / (rect.width() / rect.height())) + 0.5f));
                    }
                });
            }
        };
    }

    private final String preprocessImageMarkdown(String str) {
        return new j("!\\[.*?]\\(.*?\".*?\"\\)").h(str, MarkdownParser$preprocessImageMarkdown$1.INSTANCE);
    }

    private final String preprocessMarkdownLinks(String str) {
        Matcher matcher = Pattern.compile("\\[([^\\]]+)\\]\\(([^\\)]+)\\)", 32).matcher(str);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            q.f(group2);
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement("[" + group + "](" + new j("\\s").g(group2, "") + ")"));
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        q.h(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    private final String processMarkdown(String str) {
        return preprocessImageMarkdown(preprocessMarkdownLinks(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setup$lambda$0(Context context, p pVar) {
        q.i(context, "$context");
        q.i(pVar, "it");
        pVar.a(lb.b.c()).a(jb.a.c(context.getAssets()));
    }

    public final boolean containsMarkdown(String str) {
        q.i(str, "text");
        if (!markdownRegex.f(str) && !imageMarkdownRegex.a(str) && !markdownLinkRegex.a(str)) {
            return false;
        }
        return true;
    }

    public final cb.e getMarkwon$common_prodRelease() {
        return markwon;
    }

    public final boolean hasCached(String str) {
        if (str == null) {
            return false;
        }
        try {
            return cache.containsKey(Integer.valueOf(str.hashCode()));
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final String parseCompiled(CharSequence charSequence) {
        q.i(charSequence, "input");
        return EmojiParser.INSTANCE.convertToCheatCode(charSequence.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r1 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Spanned parseMarkdown(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 != 0) goto La
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r0 = ""
            r5.<init>(r0)
            return r5
        La:
            java.lang.String r5 = r4.processMarkdown(r5)
            int r0 = r5.hashCode()
            java.util.SortedMap<java.lang.Integer, android.text.Spanned> r1 = com.habitrpg.common.habitica.helpers.MarkdownParser.cache     // Catch: java.lang.NullPointerException -> L30
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NullPointerException -> L30
            boolean r2 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L30
            if (r2 == 0) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NullPointerException -> L30
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.NullPointerException -> L30
            android.text.Spanned r1 = (android.text.Spanned) r1     // Catch: java.lang.NullPointerException -> L30
            if (r1 != 0) goto L2f
            android.text.SpannableString r1 = new android.text.SpannableString     // Catch: java.lang.NullPointerException -> L30
            r1.<init>(r5)     // Catch: java.lang.NullPointerException -> L30
        L2f:
            return r1
        L30:
        L31:
            com.habitrpg.common.habitica.helpers.EmojiParser r1 = com.habitrpg.common.habitica.helpers.EmojiParser.INSTANCE
            java.lang.String r1 = r1.parseEmojis(r5)
            if (r1 != 0) goto L3a
            goto L3b
        L3a:
            r5 = r1
        L3b:
            cb.e r1 = com.habitrpg.common.habitica.helpers.MarkdownParser.markwon
            if (r1 == 0) goto L56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.text.Spanned r1 = r1.c(r2)
            if (r1 != 0) goto L5b
        L56:
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r5)
        L5b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NullPointerException -> L73
            java.util.SortedMap<java.lang.Integer, android.text.Spanned> r0 = com.habitrpg.common.habitica.helpers.MarkdownParser.cache     // Catch: java.lang.NullPointerException -> L73
            r0.put(r5, r1)     // Catch: java.lang.NullPointerException -> L73
            int r5 = r0.size()     // Catch: java.lang.NullPointerException -> L73
            r2 = 100
            if (r5 <= r2) goto L73
            java.lang.Object r5 = r0.firstKey()     // Catch: java.lang.NullPointerException -> L73
            r0.remove(r5)     // Catch: java.lang.NullPointerException -> L73
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.common.habitica.helpers.MarkdownParser.parseMarkdown(java.lang.String):android.text.Spanned");
    }

    public final void parseMarkdownAsync(String str, pc.l<? super Spanned, w> lVar) {
        q.i(lVar, "onSuccess");
        ad.g.d(l0.a(a1.b()), null, null, new MarkdownParser$parseMarkdownAsync$1(str, lVar, null), 3, null);
    }

    public final void setMarkwon$common_prodRelease(cb.e eVar) {
        markwon = eVar;
    }

    public final void setup(final Context context) {
        q.i(context, "context");
        markwon = cb.e.a(context).a(gb.a.a()).a(p.b(new p.b() { // from class: com.habitrpg.common.habitica.helpers.i
            @Override // io.noties.markwon.image.p.b
            public final void a(p pVar) {
                MarkdownParser.setup$lambda$0(context, pVar);
            }
        })).a(createImageSizeResolverScaleDpiPlugin(context)).a(ob.a.a(LinkMovementMethod.getInstance())).a(nb.a.c(1)).build();
    }
}
