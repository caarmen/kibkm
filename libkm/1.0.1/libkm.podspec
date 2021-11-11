Pod::Spec.new do |s|
  s.name         = "libkm"
  s.version      = "1.0.1"
  s.summary      = "Test kotlin multiplatform library"
  s.description  = <<-DESC
Test kotlin multiplatform library, iOS distribution
DESC
  s.homepage     = "https://github.com/caarmen/libkm"
  s.license      = 'TBD'
  s.authors      = { "Carmen Alvarez" => "carmen@rmen.ca" }
  s.source       = { :http => "https://github.com/caarmen/libkm/releases/download/1.0.1/libkm-1.0.1.zip", :type => 'zip' }
  s.source_files = 'libkm.framework/Headers/library.h'
  s.vendored_frameworks = 'libkm.framework'
  s.platform     = :ios, "9.0"
end
