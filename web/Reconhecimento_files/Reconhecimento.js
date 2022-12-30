// Created by iWeb 3.0.2 local-build-20101006

setTransparentGifURL('Media/transparent.gif');function applyEffects()
{var registry=IWCreateEffectRegistry();registry.registerEffects({shadow_0:new IWShadow({blurRadius:3,offset:new IWPoint(0.1736,0.9848),color:'#817b67',opacity:0.700000}),shadow_1:new IWShadow({blurRadius:3,offset:new IWPoint(0.1736,0.9848),color:'#817b67',opacity:0.700000})});registry.applyEffects();}
function hostedOnDM()
{return false;}
function onPageLoad()
{loadMozillaCSS('Reconhecimento_files/ReconhecimentoMoz.css')
fixAllIEPNGs('Media/transparent.gif');Widget.onload();applyEffects()}
function onPageUnload()
{Widget.onunload();}
