package qd;

import java.util.List;
import java.util.Map;

/* compiled from: InlineParserContextImpl.java */
/* loaded from: classes4.dex */
public class m implements ud.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<wd.a> f21745a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, td.p> f21746b;

    public m(List<wd.a> list, Map<String, td.p> map) {
        this.f21745a = list;
        this.f21746b = map;
    }

    @Override // ud.b
    public td.p a(String str) {
        return this.f21746b.get(str);
    }

    @Override // ud.b
    public List<wd.a> b() {
        return this.f21745a;
    }
}
