// Autogenerated AST node
package com.astra.ses.spell.language.model.ast;
import com.astra.ses.spell.language.model.SimpleNode;

public class argumentsType extends SimpleNode {
    public exprType[] args;
    public NameTokType vararg;
    public NameTokType kwarg;
    public exprType[] defaults;
    public exprType[] kwonlyargs;
    public exprType[] kw_defaults;
    public exprType[] annotation;
    public exprType varargannotation;
    public exprType kwargannotation;
    public exprType[] kwonlyargannotation;

    public argumentsType(exprType[] args, NameTokType vararg, NameTokType
    kwarg, exprType[] defaults, exprType[] kwonlyargs, exprType[]
    kw_defaults, exprType[] annotation, exprType varargannotation, exprType
    kwargannotation, exprType[] kwonlyargannotation) {
        this.args = args;
        this.vararg = vararg;
        this.kwarg = kwarg;
        this.defaults = defaults;
        this.kwonlyargs = kwonlyargs;
        this.kw_defaults = kw_defaults;
        this.annotation = annotation;
        this.varargannotation = varargannotation;
        this.kwargannotation = kwargannotation;
        this.kwonlyargannotation = kwonlyargannotation;
    }

    public argumentsType(exprType[] args, NameTokType vararg, NameTokType
    kwarg, exprType[] defaults, exprType[] kwonlyargs, exprType[]
    kw_defaults, exprType[] annotation, exprType varargannotation, exprType
    kwargannotation, exprType[] kwonlyargannotation, SimpleNode parent) {
        this(args, vararg, kwarg, defaults, kwonlyargs, kw_defaults,
        annotation, varargannotation, kwargannotation, kwonlyargannotation);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("arguments[");
        sb.append("args=");
        sb.append(dumpThis(this.args));
        sb.append(", ");
        sb.append("vararg=");
        sb.append(dumpThis(this.vararg));
        sb.append(", ");
        sb.append("kwarg=");
        sb.append(dumpThis(this.kwarg));
        sb.append(", ");
        sb.append("defaults=");
        sb.append(dumpThis(this.defaults));
        sb.append(", ");
        sb.append("kwonlyargs=");
        sb.append(dumpThis(this.kwonlyargs));
        sb.append(", ");
        sb.append("kw_defaults=");
        sb.append(dumpThis(this.kw_defaults));
        sb.append(", ");
        sb.append("annotation=");
        sb.append(dumpThis(this.annotation));
        sb.append(", ");
        sb.append("varargannotation=");
        sb.append(dumpThis(this.varargannotation));
        sb.append(", ");
        sb.append("kwargannotation=");
        sb.append(dumpThis(this.kwargannotation));
        sb.append(", ");
        sb.append("kwonlyargannotation=");
        sb.append(dumpThis(this.kwonlyargannotation));
        sb.append("]");
        return sb.toString();
    }

    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (args[i] != null)
                    args[i].accept(visitor);
            }
        }
        if (vararg != null)
            vararg.accept(visitor);
        if (kwarg != null)
            kwarg.accept(visitor);
        if (defaults != null) {
            for (int i = 0; i < defaults.length; i++) {
                if (defaults[i] != null)
                    defaults[i].accept(visitor);
            }
        }
        if (kwonlyargs != null) {
            for (int i = 0; i < kwonlyargs.length; i++) {
                if (kwonlyargs[i] != null)
                    kwonlyargs[i].accept(visitor);
            }
        }
        if (kw_defaults != null) {
            for (int i = 0; i < kw_defaults.length; i++) {
                if (kw_defaults[i] != null)
                    kw_defaults[i].accept(visitor);
            }
        }
        if (annotation != null) {
            for (int i = 0; i < annotation.length; i++) {
                if (annotation[i] != null)
                    annotation[i].accept(visitor);
            }
        }
        if (varargannotation != null)
            varargannotation.accept(visitor);
        if (kwargannotation != null)
            kwargannotation.accept(visitor);
        if (kwonlyargannotation != null) {
            for (int i = 0; i < kwonlyargannotation.length; i++) {
                if (kwonlyargannotation[i] != null)
                    kwonlyargannotation[i].accept(visitor);
            }
        }
    }

}
